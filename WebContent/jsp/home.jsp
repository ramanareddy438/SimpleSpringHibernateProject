<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhalaData Elastic Search POC</title>
<link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<style>
	.greenBtn {
		border-color: #98BF2B #98BF2B #5B992B!important;
		height: 32px;
		background-image: -webkit-linear-gradient(top,#7FBF4D,#98BF2B)!important;
		background-image: -moz-linear-gradient(top,#7FBF4D,#98BF2B)!important;
		border-style: solid!important;
	    border-width: 1px!important;
	    box-shadow: 0 1px 0 0 #96CA6D inset!important;
	    color: #FFF!important;
	    font-size: 16px!important;
	    font-weight: bold!important;
	    line-height: 1!important;
	    outline: 0 none!important;
	    padding: 7px 0 8px!important;
	    text-align: center!important;
	    text-shadow: 0 -1px 0 #4C9021!important;
	    width: 90px!important;
	    border-radius: 4px;
	}
	.searchTerm {
		border: 1px solid #98BF2B!important;
		border-radius: 4px;
		padding: 3px;
		width: 160px; 
		height: 30px;
	}
	.selectOption {
		height: 30px;
		border: 1px solid #98BF2B!important;
		border-radius: 4px;
	}
	.resultsTable {
		border: 1px solid #98BF2B;
		margin: 0 auto;
		width: 650px;
	}
	td {
		border: 1px solid #98BF2B;
		padding: 5px;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script>
	function highlightSearchTerm(searchTerm) {
		if(searchTerm !== "") {
			console.log("Inside the IF Statement");
			var regex = new RegExp(searchTerm.toUpperCase(), 'g');
			$(".searchResult").each(function() {
				console.log("Search Result TD");
				var unmodified  = $(this).text();
				unmodified = unmodified.replace(regex, "<b>" + searchTerm.toUpperCase() + "</b>");
				//unmodified = unmodified.replaceAll('' + searchTerm + '', "<b>" + searchTerm + "</b>");
				$(this).html(unmodified);
				unmodified = "";
			});
			
		}
	}
</script>
</head>
<body onLoad="highlightSearchTerm('${searchTerm}')">
	<!-- <a href="actorList.go">Show Actor List</a>
	<a href="campaignList.go">Show Campaign List</a>
	<a href="categoryList.go">Show Category List</a>
	<br/> -->
	<div id="container" style="border: 2px solid #A2CB2C; margin: 30px auto; width: 800px; height: 600px; border-radius: 5px; font-family: 'Roboto', sans-serif; text-align: center">
		<img src="http://www.neevtech.com/assets/template/Images/site_logo.png" style="margin-top: 30px;"/>
		<h1>Neev - PhalaData Elastic Search POC</h1>
		<div id="ElasticSearchForm">
			<form action="search.go" class="inline-form">
				<%-- <input type="text" name="searchField" id="searchField" placeholder="Enter Search Field (user, postDate or body)" value="${searchField}"/> --%>
				<%--<select name="searchField" class="selectOption">
					<option value="select field">Select Field</option>
					<c:choose>
						<c:when test="${selectedActorField == 'actor_id'}">
							<option value="actor_id" selected>Actor ID</option>
						</c:when>
						<c:otherwise>
							<option value="actor_id">Actor ID</option>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${selectedActorField == 'first_name'}">
							<option value="actor_id" selected>First Name</option>
						</c:when>
						<c:otherwise>
							<option value="first_name">First Name</option>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${selectedActorField == 'last_name'}">
							<option value="last_name" selected>Last Name</option>
						</c:when>
						<c:otherwise>
							<option value="last_name">Last Name</option>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when test="${selectedActorField == 'last_update'}">
							<option value="last_update" selected>Actor ID</option>
						</c:when>
						<c:otherwise>
							<option value="last_update">Last update</option>
						</c:otherwise>
					</c:choose>				
				</select> --%>
				<input type="text" name="searchTerm" id="searchTerm" placeholder="Enter Search Term" value="${searchTerm}" class="searchTerm"/>
				<%--<input type="number" name="searchNumber" id="searchNumber" placeholder="Enter Any Number" value="${searchNumber}" class="searchTerm"/> --%>
				<input type="text" name="searchFromDate" id="searchFromDate" placeholder="Enter From Date" value="${searchFromDate}" class="searchTerm"/>
				<input type="text" name="searchToDate" id="searchToDate" placeholder="Enter To Date" value="${searchToDate}" class="searchTerm"/>
				<input type="submit" value="Search" class="greenBtn"/>
			</form>
			<h3>Search Results : ${noOfHits}</h3>
			<div id="SearchResult" style="overflow: auto; height: 311px;">
				<table class="resultsTable">
					<c:forEach items="${results}" var="result">
						<tr>
							<c:forEach items="${result}" var="r">
								<c:if test="${!(r.key == '@version') && !(r.key == '@timestamp')}">
									<td class="searchResult"><c:out value="${r.value}"/></td>
								</c:if>
							</c:forEach>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>