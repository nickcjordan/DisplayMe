<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<div class="dark-box coins-padded-edges left-box">
	<div class="coin-balance">
		Coin Balance: <fmt:formatNumber value = "${coinBalance}" type = "currency"/>
	</div>
	<table class="table table-sm">
		<thead class="thead-inverse">
			<tr>
					<th class="coin-header">Sym</th>
					<th class="coin-header">#</th>
					<th class="coin-header">Unit</th>
					<th class="coin-header">Value</th>
			</tr>
		</thead>
		<tbody>
			
		<c:forEach items="${coins}" var="coin">
			<c:if test="${coin.quantity > 0}">
			<tr>
				<td class="coin-val"><b>${coin.symbol.getSymbol()}</b></td>
				<td class="coin-val"><fmt:formatNumber value = "${coin.quantity}" type = "number" maxFractionDigits = "4"/></td>
				<td class="coin-val"><fmt:formatNumber value = "${coin.currentUnitPriceUSD}" type = "currency"/></td>
				<td class="coin-val"><fmt:formatNumber value = "${coin.currentValueUSD}" type = "currency"/></td>
			</tr>
			</c:if>
		
		</c:forEach>
			
		</tbody>
	</table>	
</div>



