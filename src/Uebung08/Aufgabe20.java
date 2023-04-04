/*
Primitive Datentypen haben einen bestimmten Bereich, den sie darstellen können. Dies ist z.B. bei byte 8 Bit, bei int
32 Bit und bei long 64 Bit.

Der Typ byte kann somit nur Zahlen im Bereich von –128 bis +127 darstellen.

Wenn eine Addition über diese Grenzen hinweg durchgeführt wird, kommt es zu einem so genannten Overflow oder Überlauf.
D.h. wenn zu +127 die Zahl +1 hinzuaddiert wird, erhalten wir als Ergebnis –128.

Da dieses sehr fehlerträchtig ist, möchten wir für diesen Fall eine neue Exception namens OverflowException benutzen.

Diese Ausnahme soll schließlich in einer Methode
    byte addiere(byte zahl1, byte zahl2)
geworfen werden, die die beiden als Parameter übergebenen Werte addiert.
 */

package Uebung08;

public class Aufgabe20 {

}