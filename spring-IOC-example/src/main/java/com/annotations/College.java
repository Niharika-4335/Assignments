package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class College {
    @Value("${College_name}")
    private String cname;
    @Autowired
    private Principal principal;
    @Autowired
//    @Qualifier("scienceTeacher")
//    @Qualifier("mathTeacher")
    private Teacher teacher;

//    public College(Principal principal) {
//        this.principal = principal;
//    }
//@Autowired
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }
//@Autowired
//    public void setPrincipal(Principal principal) {
//        this.principal = principal;
//    }

    public void test(){
        System.out.println(cname);
       teacher.teach();
       principal.pname();
        System.out.println("testing the annotations");
    }
}
