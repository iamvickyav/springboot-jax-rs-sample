package com.iamvickyav.springbootjaxrssample.exception;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import java.util.Map;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

public class ApiExceptionMapper implements ExceptionMapper<ApiException> {

    @Override
    public Response toResponse(ApiException e) {
        return Response.status(e.getStatus())
                .header("Content-Type", APPLICATION_JSON)
                .entity(Map.of("message", e.getMessage()))
                .build();
    }
}
