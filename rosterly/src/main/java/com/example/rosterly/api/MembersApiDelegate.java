package com.example.rosterly.api;

import com.example.rosterly.model.Member;
import com.example.rosterly.model.MemberCreate;
import com.example.rosterly.model.MemberUpdate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link MembersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-27T10:12:24.329052600+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
public interface MembersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /members : メンバー一覧取得
     *
     * @param companyId 会社IDで絞り込み（A社フロントで保持する Company リストの ID を渡す） (optional)
     * @return メンバー一覧 (status code 200)
     * @see MembersApi#membersGet
     */
    default ResponseEntity<List<Member>> membersGet(Integer companyId) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"companyId\" : 6, \"role\" : \"Developer\", \"joinDate\" : \"2000-01-23\", \"phone\" : \"phone\", \"name\" : \"name\", \"projectId\" : 1, \"email\" : \"email\", \"memberId\" : 0 }, { \"companyId\" : 6, \"role\" : \"Developer\", \"joinDate\" : \"2000-01-23\", \"phone\" : \"phone\", \"name\" : \"name\", \"projectId\" : 1, \"email\" : \"email\", \"memberId\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /members/{memberId} : 特定メンバー削除
     *
     * @param memberId メンバーID (required)
     * @return 削除完了 (status code 204)
     * @see MembersApi#membersMemberIdDelete
     */
    default ResponseEntity<Void> membersMemberIdDelete(Integer memberId) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /members/{memberId} : 特定メンバー取得
     *
     * @param memberId メンバーID (required)
     * @return メンバー詳細 (status code 200)
     * @see MembersApi#membersMemberIdGet
     */
    default ResponseEntity<Member> membersMemberIdGet(Integer memberId) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"companyId\" : 6, \"role\" : \"Developer\", \"joinDate\" : \"2000-01-23\", \"phone\" : \"phone\", \"name\" : \"name\", \"projectId\" : 1, \"email\" : \"email\", \"memberId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /members/{memberId} : 特定メンバー更新
     *
     * @param memberId メンバーID (required)
     * @param memberUpdate  (required)
     * @return 更新完了 (status code 200)
     * @see MembersApi#membersMemberIdPut
     */
    default ResponseEntity<Member> membersMemberIdPut(Integer memberId,
        MemberUpdate memberUpdate) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"companyId\" : 6, \"role\" : \"Developer\", \"joinDate\" : \"2000-01-23\", \"phone\" : \"phone\", \"name\" : \"name\", \"projectId\" : 1, \"email\" : \"email\", \"memberId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /members : メンバー新規作成
     *
     * @param memberCreate  (required)
     * @return 作成完了 (status code 201)
     * @see MembersApi#membersPost
     */
    default ResponseEntity<Member> membersPost(MemberCreate memberCreate) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"companyId\" : 6, \"role\" : \"Developer\", \"joinDate\" : \"2000-01-23\", \"phone\" : \"phone\", \"name\" : \"name\", \"projectId\" : 1, \"email\" : \"email\", \"memberId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
