package com.thermondo.util

class AuthenticationException : RuntimeException()
class AuthorizationException : RuntimeException()

open class ValidationException(val params: Map<String, List<String>>) : RuntimeException()

class UserExists : RuntimeException()

class UserDoesNotExists : RuntimeException()

class NoteDoesNotExist(val id: String) : RuntimeException()
