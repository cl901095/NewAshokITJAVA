package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {

		List<String> asList = Arrays.asList("ema", "ema", "john", "Amit", "karen");

		List<List<String>> asList1 = Arrays.asList(Arrays.asList("ema", "john", "Amit", "karen"),
				Arrays.asList("mike"));

		List<Integer> asList2 = Arrays.asList(1, 3, 4, 5, 6, 7, 8);

		// #1 Stream->conerts a collection into stream
		Stream<String> stream = asList.stream();
		System.out.println(stream);

		// #2 fliter->fliter based on predicate
		List<String> flitered = asList.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
		System.out.println(flitered);

		// #3 map()->trnsform each element into another form
		List<Integer> collect = asList.stream().map(String::length).collect(Collectors.toList());
		System.out.println(collect);

		// #4 flatmap()-> flattensnested structure into a single stream

		List<String> nameflatened = asList1.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println(nameflatened);

		// #5 forEach()->performs an action on each element

		asList1.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);

		// # 6 Collect()->collect the element into collection
		asList1.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);

		// #7 sorted->sort the elemets in natural order using comparator
		List<String> collect2 = asList.stream().sorted().collect(Collectors.toList());
		System.out.println(collect2);

		// #8 List()-> limits the number of elements from the stream
		List<String> limitednames = asList.stream().limit(2).collect(Collectors.toList());
		System.out.println(limitednames);

		// #9 distinct()->remove duplicates from stream

		List<String> collect3 = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect3);

		// #10 Skip()-> Skips the first n elements from the stream
		List<String> names = asList.stream().skip(2).collect(Collectors.toList());
		System.out.println(names);

		// #11 peek()->allowing ispection of each element in the stream
		List<String> collect4 = asList.stream().peek(System.out::println).collect(Collectors.toList());

		// #12 count()->count the number of elements in the stream
		long count = asList.stream().count();
		System.out.println(count);

		// #13 allMatch()->return true if all elements match the predicate

		boolean match = asList.stream().allMatch(x -> x.startsWith("e"));
		System.out.println(match);

		// #14 anyMatch()->returns true if any element match the pridcate

		boolean match2 = asList.stream().anyMatch(x -> x.startsWith("e"));
		System.out.println(match2);

		// #15 nonMatch()->returns true if none match the elements match the predicate
		boolean match3 = asList.stream().noneMatch(x -> x.startsWith("a"));
		System.out.println(match3);

		// #16 FindFirst->returns the first element of the stream
		Optional<String> first = asList.stream().findFirst();
		System.out.println(first);

		String first1 = asList.stream().findFirst().get();
		System.out.println(first1);

		// #17 findAny()->returns any element of the stream

		String name = asList.stream().findAny().get();
		System.out.println(name);

		// #18 max()->finds the maximum element according to a comparator

		Integer max = asList2.stream().max(Integer::compareTo).get();
		System.out.println(max);

		// #19 min()->finds the minimum element according to comparator

		Integer min = asList2.stream().min(Integer::compareTo).get();
		System.out.println(min);

		// # 20 toArray()->convert the stream to array

		String[] array = asList.stream().toArray(String[]::new);
		for (String a : array) {
			System.out.println(a);
		}

		// 21 #genearte()->create infinte stream of elements
		Stream<Double> stream2 = Stream.generate(Math::random);
		stream2.limit(10).forEach(System.out::println);

		// 22. #iterate()->creates infinte stream by iteration over afunction
		Stream<Integer> limit = Stream.iterate(0, n -> n + 2).limit(10);
		limit.forEach(System.out::println);

		// 23. # of()->creates a stream from set of values

		Stream<String> of = Stream.of("a", "b", "c", "d");
		of.forEach(System.out::println);

		// 24. #concat()->concannates two strings
		Stream<String> of2 = Stream.of("I am part 1");
		Stream<String> of3 = Stream.of("I am part2");
		Stream<String> of4 = Stream.concat(of2, of3);
		of4.forEach(System.out::println);
		// 25: # reduce()-> reduces the element into single value(Accumalator)
		Integer reduce = asList2.stream().reduce(0, Integer::sum);
		System.out.println(reduce);

	}

}
