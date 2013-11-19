package citest.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import citest.HelloWorld;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld target = new HelloWorld();
		assertThat(target.getHello(), is(""));
	}

}
