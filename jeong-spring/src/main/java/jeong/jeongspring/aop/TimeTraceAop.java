package jeong.jeongspring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {
    //적용할 범위 타겟팅
    @Around("execution(* jeong.jeongspring..*(..))") //패키지 하위 다 적용
    public Object execut(ProceedingJoinPoint jointPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("START : "+jointPoint.toString());
        try{
            return jointPoint.proceed();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END : "+jointPoint.toString() + " "+timeMs +" ms");
        }
    }
}
