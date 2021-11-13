package io.github.kory33.bugreports.scalafmt

trait T
trait T2 { self: T =>
  enum T2Enum:
    case EnumCase

  extension (n: Int) def negate: Int = -n
}
