<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="no">
<head>
	<link href="css/simple.css" rel="stylesheet" type="text/css" />
<!-- <script src="js/myscript.js" defer></script>  -->  
	<title>Påmelding</title>
	
</head>

	<!-- Jeg har fjernet alt som har med form og input å gjøre,
		 siden dette er pensum. Her får dere sette opp skjemaet
		 selv. Lykke til.
	-->

<body>
 <h2>Påmelding</h2>
	<form action="paameldt" method="post">
                
                <div>
                        <label for="fornavn">Fornavn:</label>
                        <input type="text" id="fornavn" name="fornavn" 
                        value="${deltager.fornavn}" required>
                    </div>
                    <br>
                    <div>
                        <label for="etternavn">Etternavn:</label>
                        <input type="text" id="etternavn" name="etternavn" 
                        value="${deltager.etternavn}" required>
                    </div>
                    <br>
                    <div>
                        <label for="mobilnummer">Mobilnummer:</label>
                        <input type="tel" maxlength="8" id="mobilnummer" name="mobilnummer" 
                        value="${deltager.mobilnummer}" pattern="[0-9]{8}"
                        minlength="8" required>
                    </div>
                    <br>
                    <div>
                        <label for="passord">Passord:</label>
                        <input type="password" id="passord" name="passord" 
                        required>
                        
                    </div>
                    <br>
                    <div>
                        <label for="repetert_passord">Repetert passord:</label>
                        <input type="password" id="repetert_passord" name="repetert_passord" required>
                    </div>
                    <br>
                    <div>

                        <label for="kjonn">Kjønn</label> <br />
                        <input type="radio" name="kjonn" required value="mann" /> mann
                        <input type="radio" name="kjonn" required value="kvinne" /> kvinne<br />

                        <div>
                        <button type="submit">Meld meg på</button>
                    </div>
                </form>
<script>
    function validFornavn(fornavn) {
        const regex = /^[A-ZÆØÅ][a-zæøåA-ZÆØÅ\-]{1,19}$/;
        return regex.test(fornavn)
    }
    function validEtternavn(etternavn) {
    const regex = /^[A-ZÆØÅ][a-zæøåA-ZÆØÅ\-]{1,19}$/;
    return regex.test(etternavn);
    }
    function validMobil(mobil, existingNumbers) {
    const regex = /^[0-9]{8}$/;
    return regex.test(mobil) && !existingNumbers.includes(mobil);
    }

    
    const pasFelt = document.getElementsByTagName("input")[3]
    const pasFelt2 = document.getElementsByTagName("input")[4]

    function erLike() {
    if (pasFelt.value !== pasFelt2.value) {
        pasFelt2.setCustomValidity("Passordene må være like!");
            } else {
                pasFelt2.setCustomValidity(""); // Nullstiller feilmeldingen
            }
        }
        pasFelt2.addEventListener("input", erLike);
</script>
</body>
</html>