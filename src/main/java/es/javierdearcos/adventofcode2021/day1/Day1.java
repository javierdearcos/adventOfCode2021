/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.javierdearcos.adventofcode2021.day1;

import java.util.List;

/**
 * @author Javier de Arcos
 */
public class Day1 {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        Sonar sonar = new Sonar();

        List<Integer> measures = fileReader.read("/day1/sample.txt");

        int solution = sonar.sweep(measures);

        System.out.println("Solution Part 1: " + solution);

        SlidingWindowSonar slidingWindowSonar = new SlidingWindowSonar(3, sonar);

        solution = slidingWindowSonar.sweep(measures);

        System.out.println("Solution Part 2: " + solution);
    }
}
