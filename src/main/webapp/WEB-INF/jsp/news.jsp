<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="news-box sideways-news">
					<%int article_count = 0;%>
	<c:forEach items="${news}" var="source">
		<div class="col news-col">
			<div class="row">
				<div class="col text-center">
					<h4 class="biggy">${source.displayName}</h4>
				</div>
			</div>
			<div class="row">
				<div class="scroll news-block">
					
					<c:forEach items="${source.articles}" var="article">
					
					<%article_count++;%>
					
						<ul class="list-unstyled squeeze">
							<li class="media"  id="popover_news_<%=article_count%>" tabindex="0" role="button" data-trigger="focus">
							
								 <div class="media-body">
									<div class="card bg-dark text-white glowy">
									 <img class="card-img img-thumbnail dark-pic" src="${article.urlToImage}"/>
									  <div class="card-img-overlay d-flex fix-pad">
									    <h5 class="card-title mt-auto text-white"><a href="${article.url}" class="big-link"><b>${article.title}</b></a></h5>
									  </div>
									</div>
								</div>
								
							</li>
							
						</ul>
						<div class="hidden news-text" id="popover_news-content_<%=article_count%>"><p>${article.description}</p></div>
						<script>
							$(function(){ $("#popover_news_<%=article_count%>").popover({
							    	trigger: 'hover',
							        html : true,
							        content: function() { return $("#popover_news-content_<%=article_count%>").html(); }
							    });
							});
						</script>
						
					</c:forEach>
				</div>
			</div>
		</div>
	</c:forEach>
	</div>
