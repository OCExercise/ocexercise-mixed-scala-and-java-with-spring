package org.opencorrelate.exercise.jvm

class Person(val name: String, val machine: Computer) {


    def computer : Computer = machine
    override def toString = name

}