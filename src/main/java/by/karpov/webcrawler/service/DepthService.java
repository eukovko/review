package by.karpov.webcrawler.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
@RequiredArgsConstructor
public class DepthService {

    @Value("depth.message")
    private String message;
    @Value("depth.value")
    int depth;
    private final Scanner scanner;

    public int getInt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    public int getDepth(){
        return depth;
    }
}
