# Greek Namedays
A list of all Greek Namedays as JSON and tips on how to handle Greek Namedays

This repository contains a collection of all Greek Namedays. This list was created by scrapping information from various websites online so the list might contain errors or missing information. PRs are more than welcome in order to have an up-to-date source of all Greek Namedays 😄

### Why?
I noticed there are no sources available online for that. Since Namedays are a big thing in Greece, and collecting them all is a huge effort, I decided to share what I have gathered so that more can benefit.

## How does it work?
There are currently two JSON files with all Namedays in place.

### Recurring Namedays [(recurring_namedays.json)](https://github.com/alexstyl/Greek-namedays/blob/master/recurring_namedays.json)
In this file you can find all namedays with fixed date.

### Easter Related Namedays [(relative_to_easter.json)](https://github.com/alexstyl/Greek-namedays/blob/master/relative_to_easter.json)
This file contains all namedays assosiated to easter. You need to calculate Easter Sunday first before finding the exact nameday of a specific year for those.

### Calculating Easter
Greeks celebrate the Orthodox Easter. You can find [a Java implementation](https://github.com/alexstyl/Greek-namedays/blob/master/OrthodoxEasterCalculator.java) of how to calculate the Easter Sunday, but you can find a lot of ways of calculating by yourself online ([such as on Wikipedia](https://en.wikipedia.org/wiki/Computus#Gauss_algorithm)).

# Licensing
All information found in this repository is public information, does not belong to anyone and you are free to use it however you like it. No need to give credit if used.
Please consider opening a PR in case you find any namedays missing though.

```
This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.

In jurisdictions that recognize copyright laws, the author or authors
of this software dedicate any and all copyright interest in the
software to the public domain. We make this dedication for the benefit
of the public at large and to the detriment of our heirs and
successors. We intend this dedication to be an overt act of
relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

For more information, please refer to <http://unlicense.org>
```
