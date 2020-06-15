# CoronaMaskConfigurator-Task2

## Task 2

Implementieren Sie die Variabilität der zuvor modellierten Domäne mittels Laufzeitparametern.
Es sollen wenigstens 2 Features Ihrer Domäne über Parameter der Main-
Methode an- und abgewählt werden können. Markieren Sie die bereits implementierten
Features im Feature-Modell als konkret und alle anderen als abstrakt. Testen Sie die Implementierung
mit den 5 typischen Konfigurationen und dokumentieren Sie eventuell gefun-
dene Fehler in einer Textdatei. Das Beheben der Fehler ist nicht zwingend erforderlich.
Entwickeln Sie Ihre Anwendung als FeatureIDE-Projekt (Composer: Runtime Parameters)
oder als Java-Projekt in Eclipse. HelloWorld-Properties und HelloWorld-Run
Configurations sind Beispiel-Projekte, welche zwei mögliche Optionen mit FeatureIDE
vorstellen. Screencasts dazu sind auch verfügbar.5 Für Properties gibt es derzeit etwas bessere
Toolunterstützung (z.B. Einfärben von Quelltext, Kollaborationsdiagram) als für Run
Congurations. Für diese Aufgabe wird mindestens FeatureIDE v3.0.0 benötigt.
In dieser und allen folgenden praktischen Aufgaben:Wenn Sie auf einer bestehenden Software
aufbauen, geben Sie bitte die Quelle (z.B. Link) und dessen Lizenz in einer README-
Datei an. Bitte stellen Sie sicher, dass Ihre Änderungen am Repository tatsächlich hochgeladen
wurden, inklusive .project Datei (z.B. Push bei Git nicht vergessen).



- wenigstens 2 Features umgesetzt und auswählbar über Main-Parameter -> Check
- 5 Konfigurationen (Namen mit Leerzeichen und die mit Ziffern starten ergeben Fehler) -> Check
- Composer: Properties -> Check
- keine bestehende Software verwendet -> Check



In der Übung interessieren wir uns für Ihre Erfahrungen. Welche Fehler haben Sie beim
Testen gefunden? Wie sind Sie beim Programmieren vorgegangen? Haben Sie die Parameter
nacheinander entwickelt? Welche Änderungen mussten Sie vornehmen? Welche der 5
Konfigurationen verhalten sich identisch?

- Fehler ergeben sich durch falsche Namen (dürfen keine Leerzeichen enthalten und nicht mit Ziffern anfangen)
- wenn man die Konfiguration parallel offen hat in Eclipse und andere Dateien gleichzeitig bearbeitet -> Eclipse freezed sehr oft
- Bei Features, die Pflicht sind und nur eine Option gleichzeitig zur Auswahl haben -> Übergeordneter Feature-Name in einer if-Anweisung und die Unteroptionen in verschachtelten if-Anweisungen.
- Ja, Parameter wurden nacheinander entwickelt.
- Änderungen? Nur Namen umbenannt.
- config1 und config2 verhalten sich identisch