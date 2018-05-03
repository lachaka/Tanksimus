package org.elsys.ip.resource;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;
import org.elsys.ip.models.Notification;
import org.elsys.ip.models.User;
import org.elsys.ip.service.TankService;
import org.elsys.ip.service.UserService;

import javax.ws.rs.*;
import java.util.List;

@Path("user")
public class UserResource {
    private UserService userService = new UserService();

    @GET
    @Produces("application/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GET
    @Path("/{id}")
    @Produces("applciation/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public User getUserById(@PathParam("id") Integer id) {
        return userService.getUserById(id);
    }

    @POST
    @Consumes("application/json")
    public void saveUser(User user) {
        userService.saveUser(user);
    }

    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public User updateUser(@PathParam("id") Integer id, User user) {
        return userService.updateUser(id, user);
    }

    @DELETE
    @Path("/{id}")
    public void deleteUser(@PathParam("id") Integer id) {
        userService.deleteUser(id);
    }

    @GET
    @Path("/{id}/notification")
    @Produces("application/json")
    @JacksonFeatures(serializationEnable = {SerializationFeature.INDENT_OUTPUT})
    public List<Notification> getNotificationsByUserId(@PathParam("id") Integer id) {
        return userService.getNotificationsByUserId(id);
    }
}
