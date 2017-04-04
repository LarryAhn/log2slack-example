package com.example;

import com.geekswise.aspect.Log2Slack;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahn on 2017. 4. 5..
 */
@Service
public class SampleService {

    @Log2Slack
    public List<Member> getMembers() {
        List<Member> blackPink = new ArrayList<>();
        blackPink.add(new Member("지수", "치츄"));
        blackPink.add(new Member("제니", "젠득이"));
        blackPink.add(new Member("로제", "파스타"));
        blackPink.add(new Member("리사", "날라리사, 요리사, 조리사.."));
        return blackPink;
    }

}
