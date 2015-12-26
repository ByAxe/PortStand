<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-content">
        <div class="close-modal" data-dismiss="modal">
            <div class="lr">
                <div class="rl">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="modal-body">
                        <!-- Project Details Go Here -->
                        <h2>Project Name</h2>

                        <p class="item-intro text-muted">Lorem ipsum dolor sit amet consectetur.</p>
                        <img class="img-responsive img-centered" src="<c:url value='/resources/dist/img/portfolio/treehouse-preview.png'/>" alt="">

                        <p>Treehouse is a free PSD web template built by <a href="https://www.behance.net/MathavanJaya">Mathavan
                            Jaya</a>. This is bright and spacious design perfect for people or startup companies looking
                            to showcase their apps or other projects.</p>

                        <p>You can download the PSD template in this portfolio sample item at <a
                                href="http://freebiesxpress.com/gallery/treehouse-free-psd-web-template/">FreebiesXpress.com</a>.
                        </p>
                        <button type="button" class="btn btn-primary" data-dismiss="modal"><i class="fa fa-times"></i>
                            Close Project
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
