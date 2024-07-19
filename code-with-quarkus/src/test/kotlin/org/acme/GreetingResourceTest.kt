package org.acme

import io.quarkus.logging.Log
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

@QuarkusTest
class GreetingResourceTest {

    @ParameterizedTest
    @MethodSource("provider")
    fun test1(
        function1: (String) -> String,
    ) {
        Log.info("test")
    }

    @Test
    fun test2() {
        test1(function1)
    }

    companion object {

        val function1: (String) -> String = { r: String -> r }

        @JvmStatic
        fun provider(): Stream<Arguments> {

            return Stream.of(Arguments.of(function1))
        }

    }
}