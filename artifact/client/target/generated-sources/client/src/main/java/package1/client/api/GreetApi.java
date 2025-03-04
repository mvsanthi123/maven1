/**
 * Hello World Greet Helidon MP Application
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package package1.client.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import package1.client.model.GreetResponse;
import package1.client.model.GreetUpdate;

/**
 * Hello World Greet Helidon MP Application
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 */
@RegisterRestClient(configKey="GreetClient")
@RegisterProvider(ApiExceptionMapper.class)
@Path("/greet")
public interface GreetApi  {

    /**
     * Gets default greet message
     */
    @GET
    
    @Produces({ "application/json" })
    GreetResponse getDefaultMessage() throws ApiException, ProcessingException;

    /**
     * Gets message based on the parameter name
     */
    @GET
    @Path("/{name}")
    @Produces({ "application/json" })
    GreetResponse getMessage(@PathParam("name") String name) throws ApiException, ProcessingException;

    /**
     * Set the greeting to use in future messages.
     */
    @PUT
    @Path("/greeting")
    @Consumes({ "application/json" })
    void updateGreeting(GreetUpdate greetUpdate) throws ApiException, ProcessingException;
}
