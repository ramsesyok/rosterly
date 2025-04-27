package com.example.rosterly.api;

import com.example.rosterly.model.Member;
import com.example.rosterly.model.MemberCreate;
import com.example.rosterly.model.MemberUpdate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-27T10:12:24.329052600+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
@Controller
@RequestMapping("${openapi.rosterlyMember.base-path:/api}")
public class MembersApiController implements MembersApi {

    private final MembersApiDelegate delegate;

    public MembersApiController(@Autowired(required = false) MembersApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new MembersApiDelegate() {});
    }

    @Override
    public MembersApiDelegate getDelegate() {
        return delegate;
    }

}
