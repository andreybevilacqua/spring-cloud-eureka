package demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import demo.dao.*;
import demo.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    AdjectiveClient adjectiveClient;

    @Autowired
    ArticleClient articleClient;

    @Autowired
    NounClient nounClient;

    @Autowired
    SubjectClient subjectClient;

    @Autowired
    VerbClient verbClient;


    @Override
    @HystrixCommand(fallbackMethod = "getFallbackSubject")
    public Word getSubject() { return subjectClient.getWord(); }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackVerb")
    public Word getVerb() {
        return verbClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackArticle")
    public Word getArticle() {
        return articleClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackAdjective")
    public Word getAdjective() {
        return adjectiveClient.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackNoun")
    public Word getNoun() { return nounClient.getWord(); }

    // Hystrix Methods.
    // Toods entram no fallback sempre
    public Word getFallbackSubject(){ return new Word("Someone (fallback)"); }

    public Word getFallbackVerb(){ return new Word("Verb (fallback)"); }

    public Word getFallbackArticle(){ return new Word("Article (fallback)"); }

    public Word getFallbackAdjective(){ return new Word("Adjective (fallback)"); }

    public Word getFallbackNoun(){ return new Word("something (fallback)"); }
}
