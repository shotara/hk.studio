<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Day Schedule Selector jQuery Plugin Demo</title>
  <!--[if IE]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
  <link rel="stylesheet" type="text/css" href="../../css/timetableView.css">
  <link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
  <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
  <style>
  body { font-family:'roboto'; background-color:#ECF0F1; }
  </style>
</head>
<body>
<h1 style="margin:150px auto 30px auto;">입력하신 시간표입니다.</h1>
  <div id="day-schedule"></div>

<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
  <script src="../../js/index.js"></script>
  <script>
    (function ($) {
      $("#day-schedule").dayScheduleSelector({
        /*
        days: [1, 2, 3, 5, 6],
        interval: 15,
        startTime: '09:50',
        endTime: '21:06'
        */
      });
      $("#day-schedule").on('selected.artsy.dayScheduleSelector', function (e, selected) {
        console.log(selected);
      })
      $("#day-schedule").data('artsy.dayScheduleSelector').deserialize({
        '0': [['09:30', '11:00'], ['13:00', '16:30']]
      });
      $("#day-schedule").data('artsy.dayScheduleSelector').deserialize({
          '3': [['18:00', '20:00'], ['13:00', '16:30']]
        });
    })($);
  </script>
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-36251023-1']);
  _gaq.push(['_setDomainName', 'jqueryscript.net']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
</body>
</html>