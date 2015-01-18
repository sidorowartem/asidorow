var WebPage = WebPage != null ? WebPage : {};

var QuestionPage = function () {
    var obj = {
        question: null
    };

    var initUI = function () {
        var $questionHolder = $("#questionHolder");
        $questionHolder.html(obj.question.questionText);
    };

    var onDataLoaded = function (data) {
        obj.question = data;
        initUI();
    };

    var loadData = function () {
        $.get("getRandomQuestion.data", {}).done(onDataLoaded);
    };

    obj.init = function () {
        loadData();
    };

    return obj;
};

WebPage.questionPage = QuestionPage();
WebPage.questionPage.init();
