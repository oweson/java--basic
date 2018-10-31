package eclipse.mar.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月22日 下午9:15:52 类说明：侵权必究。。。。。。。
 */

public class ForeachList {
    public static void main(String[] args) {
        List<String> asList = Arrays.asList("Lambdas", "Default Method", "Stream API");
		/*asList.forEach(n -> System.out.println(n));
		asList.forEach(j->System.out.println(j));*/
        asList.forEach(System.out::println);
        /*
         * Copyright 2018 the original author or authors.
         *
         * Licensed under the Apache License, Version 2.0 (the "License");
         * you may not use this file except in compliance with the License.
         * You may obtain a copy of the License at
         *
         *      http://www.apache.org/licenses/LICENSE-2.0
         *
         * Unless required by applicable law or agreed to in writing, software
         * distributed under the License is distributed on an "AS IS" BASIS,
         * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
         * See the License for the specific language governing permissions and
         * limitations under the License.
         */

    }

}
