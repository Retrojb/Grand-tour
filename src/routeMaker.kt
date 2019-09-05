package org.teatez.grand
import io.ktor.routing.*

import jdk.nashorn.internal.objects.NativeRegExp
import java.io.File
import java.util.*


/* Ktor API Route Generator
dependent on io.ktor.routin. *

  1. Identify the kotlin directory path to kclasses
       a. will require user to set path variable to the sources root
   1.1 Gather all kclasses
       a. from the class identify all class parameters
       b. identify data obj classes
       c. gather the variables and types / primitives
       d. generic toString()
       e. return classes as obj array i.e [ { class: dog { name: <S> }}, { class: cat { name: <S> } ...}

   2. Iterate over the class list
       a. pass object array into a `fun` to iterate over them as a list<T>
           a. may need to map each obj to a List<T>
       b. deconstruct obj to primitive kv pairs
           a. determine use in routing. ie --> user.oid passed in for a user
           b. figure out primary url scenarios for passing variables
       c. send to helper / util i.e stringHelper ...
           a. return all in correct type (camel, pascal)
           b. generate any other helpers (will revisit later)

    3. generate class routing for ktor
       a. invocation functions
       b. how to attach the routes into ktor application
       c. host to maven repo

*/
class routeMaker<T>(t: T) {
    var klc = t

    fun getKotlinKlass(klc: T) {

    }
}
