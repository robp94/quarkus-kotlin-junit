package org.acme

import io.quarkus.logging.Log
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.UUID
import java.util.stream.Stream

@QuarkusTest
class GreetingResourceTest {

    @ParameterizedTest
    @MethodSource("array")
    fun testArray(a: List<ObjectB>){
        Log.info(a)
    }

    companion object {

        @JvmStatic
        fun array(): Stream<Arguments> {
            return Stream.of(Arguments.of(
                listOf(
                    ObjectB(
                        s = "1",
                    ),
                    ObjectB(
                        s = "2",
                    ),
                ),
            ))
        }
    }
}
