package com.jillian

import org.gradle.api.Plugin
import org.gradle.api.Project

class Test implements Plugin<Project> {

    @Override
    void apply(Project target) {
        target.task('testHello') {  //创建任务hello
            doLast {
                println 'Hello from the com.jillian.Test'
            }
        }
    }
}
/** 执行任务：gradle testHello，输出自定义插件中的任务打印：
 * > Task :testHello
 * Hello from the com.jillian.Test
 */

