package jeong.jeongspring;

import jeong.jeongspring.aop.TimeTraceAop;
import jeong.jeongspring.repository.*;
import jeong.jeongspring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired //생성자가 하나일 경우 생략 가능
    public SpringConfig(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    //특정 함수의 경우 직접 등록하여 인지시켜주는 것이 좋다.
//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }



   // @Bean
    //public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        // 객체지향적인 설계가 좋은 이유는 다형성을 활용하여 구현체 변경에 용이
//        return new JdbcTemplateMemberRepository(dataSource);
        //return new JpaMemberRepository(em);
     //   return
    // }

     /*참고 : DI에는 field 주입, setter 주입, 생성자 주입 이렇게 3가지 방법이 있다. 의존관계가 실행중에 동적으로 변하는 경우는 거의 없으므로 생성자 주입을 권장한다.
            실무에서는 주로 정형화된 컨트롤러, 서비스, 리포지토리 같은 코드는 컴포넌트 스캔을 사용한다. 그리고 정형화 되지 않거나, 상황에 따라 구현 클래스를 변경해야 하면 설정을 통해 스프링 빈으로 등록한다.
            '@Autowired' 를 통한 DI는 'helloController', 'MemberService' 등과 같이 스프링이 관리하는 객체에서만 동작한다. 스프링 빈으로 등록하지 않고 내가 직접 생성한 객체에서는 동작하지 않는다.
    */
}
