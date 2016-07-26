import com.phealy1982.controllers.PlayerController
import com.phealy1982.util.URIConstant
import groovy.json.JsonSlurper
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.http.HttpStatus.*;


class PlayerControllerTest extends Specification {

    def playerController = new PlayerController()

    MockMvc mockMvc = standaloneSetup(playerController).build()

    def setup() {


    }

    def "test get player response"() {

        when: 'rest player get url is hit'
        def response = mockMvc.perform(get(URIConstant.PLAYER_GET_URI,1)).andReturn().response
        def content = new JsonSlurper().parseText(response.contentAsString)

        then: 'correctly returned user in JSON'

        response.status == OK.value()

        response.contentType.contains('application/json')
        response.contentType == 'application/json;charset=UTF-8'

        response.contentAsString == '{"name":"Dummy"}'

        content.name == 'Dummy'
    }

}