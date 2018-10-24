package demo.dao;

import demo.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Noun
@FeignClient(name = "NOUN")
public interface NounClient {

    @RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json", consumes = "application/json")
    Word getWord();

}
