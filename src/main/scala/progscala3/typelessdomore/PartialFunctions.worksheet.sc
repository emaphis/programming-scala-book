// Partial functions

// src\main\scala\progscala3\typelessdomore\PartialFunction.worksheet.sc

val pfs: PartialFunction[Matchable, String] =
    case s:String => "YES" 
    
val pfd: PartialFunction[Matchable, String] =
    case d:Double => "YES"


val pfsd = pfs.orElse(pfd)


def tryPF(x: Matchable, f: PartialFunction[Matchable,String]): String =
  try f(x)
  catch case _: MatchError => "ERROR!"
        

tryPF("str", pfs)
tryPF("str", pfd)
tryPF("str", pfsd)

tryPF(3.142, pfs)
tryPF(3.142, pfd)
tryPF(3.142, pfsd)

tryPF(2, pfs)
tryPF(2, pfd)
tryPF(2, pfsd)

pfs.isDefinedAt("str")
pfd.isDefinedAt("str")
pfsd.isDefinedAt("str")

pfs.isDefinedAt(3.142)
pfd.isDefinedAt(3.142)
pfsd.isDefinedAt(3.142)

pfs.isDefinedAt(2)
pfd.isDefinedAt(2)
pfsd.isDefinedAt(2)

val fs = pfs.lift
fs("str")
fs(3.142)
