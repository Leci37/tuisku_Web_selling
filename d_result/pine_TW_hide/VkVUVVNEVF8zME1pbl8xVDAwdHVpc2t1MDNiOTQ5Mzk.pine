//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: VETUSDT_30Min_1T00_03b94939 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_1T00_03b94939", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_03b94939(ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= -0.000112 )
		if( ema3 <= 0.193985 )
			if( ema2 <= 0.030254 )
				if( ema3 <= 0.026848 )
					if( ema3 <= 0.023908 )
						if( tema <= 0.013089 )
							if( ema3 <= 0.013259 )
								if( ema13 <= -0.000411 )
									ret := 0.515152
								if( ema13 > -0.000411 )
									ret := 0.073684
							if( ema3 > 0.013259 )
								if( ema2 <= 0.013694 )
									ret := -0.754386 // sell
								if( ema2 > 0.013694 )
									ret := 0.138889
						if( tema > 0.013089 )
							if( ema12 <= -0.000426 )
								if( ema1 <= 0.021381 )
									ret := 0.358621
								if( ema1 > 0.021381 )
									ret := 0.930693 // buy
							if( ema12 > -0.000426 )
								if( ema3 <= 0.023543 )
									ret := 0.160289
								if( ema3 > 0.023543 )
									ret := 0.480392
					if( ema3 > 0.023908 )
						if( ema2 <= 0.025274 )
							if( ema2 <= 0.024136 )
								if( ema13 <= -0.000943 )
									ret := 0.590909
								if( ema13 > -0.000943 )
									ret := -0.378378
							if( ema2 > 0.024136 )
								if( ema3 <= 0.02439 )
									ret := 0.396396
								if( ema3 > 0.02439 )
									ret := -0.159938
						if( ema2 > 0.025274 )
							if( ema2 <= 0.02666 )
								if( ema1 <= 0.026218 )
									ret := 0.091047
								if( ema1 > 0.026218 )
									ret := 0.473684
							if( ema2 > 0.02666 )
								if( ema3 <= 0.026801 )
									ret := 0.636364
								if( ema3 > 0.026801 )
									ret := -0.766667 // sell
				if( ema3 > 0.026848 )
					if( ema13 <= -0.000452 )
						if( ema1 <= 0.027527 )
							if( ema1 <= 0.027264 )
								if( tema <= 0.026059 )
									ret := 0.800000 // buy
								if( tema > 0.026059 )
									ret := 0.232877
							if( ema1 > 0.027264 )
								if( ema3 <= 0.028099 )
									ret := 1.000000 // buy
								if( ema3 > 0.028099 )
									ret := 0.478261
						if( ema1 > 0.027527 )
							if( ema13 <= -0.00066 )
								if( ema3 <= 0.028796 )
									ret := -0.702703 // sell
								if( ema3 > 0.028796 )
									ret := 0.419643
							if( ema13 > -0.00066 )
								if( ema1 <= 0.027798 )
									ret := 0.466667
								if( ema1 > 0.027798 )
									ret := -0.385787
					if( ema13 > -0.000452 )
						if( ema12 <= -0.000142 )
							if( ema13 <= -0.000245 )
								if( ema12 <= -0.000265 )
									ret := 0.674699
								if( ema12 > -0.000265 )
									ret := 0.312989
							if( ema13 > -0.000245 )
								if( ema13 <= -0.00023 )
									ret := 0.931818 // buy
								if( ema13 > -0.00023 )
									ret := 0.690265
						if( ema12 > -0.000142 )
							if( ema1 <= 0.028097 )
								if( ema13 <= -0.000278 )
									ret := -0.545455
								if( ema13 > -0.000278 )
									ret := 0.420732
							if( ema1 > 0.028097 )
								if( ema13 <= -0.000135 )
									ret := 0.137566
								if( ema13 > -0.000135 )
									ret := -0.535714
			if( ema2 > 0.030254 )
				if( ema1 <= 0.032682 )
					if( ema3 <= 0.032368 )
						if( ema3 <= 0.031681 )
							if( ema12 <= -0.000219 )
								if( tema <= 0.029831 )
									ret := 0.416667
								if( tema > 0.029831 )
									ret := -0.102128
							if( ema12 > -0.000219 )
								if( ema2 <= 0.030945 )
									ret := -0.337778
								if( ema2 > 0.030945 )
									ret := -0.604061
						if( ema3 > 0.031681 )
							if( ema2 <= 0.031615 )
								if( tema <= 0.030207 )
									ret := 1.000000 // buy
								if( tema > 0.030207 )
									ret := 0.541667
							if( ema2 > 0.031615 )
								if( tema <= 0.031657 )
									ret := -0.035294
								if( tema > 0.031657 )
									ret := 0.695652
					if( ema3 > 0.032368 )
						if( tema <= 0.031466 )
							if( ema2 <= 0.032043 )
								ret := -0.555556
							if( ema2 > 0.032043 )
								if( ema12 <= -0.000491 )
									ret := -0.093750
								if( ema12 > -0.000491 )
									ret := 0.416667
						if( tema > 0.031466 )
							if( tema <= 0.032052 )
								if( ema13 <= -0.000454 )
									ret := -0.905660 // sell
								if( ema13 > -0.000454 )
									ret := -0.692308
							if( tema > 0.032052 )
								if( ema1 <= 0.032449 )
									ret := 0.150000
								if( ema1 > 0.032449 )
									ret := -0.739130 // sell
				if( ema1 > 0.032682 )
					if( ema3 <= 0.04084 )
						if( ema1 <= 0.03971 )
							if( ema2 <= 0.039551 )
								if( ema13 <= -0.001847 )
									ret := -1.000000 // sell
								if( ema13 > -0.001847 )
									ret := 0.261261
							if( ema2 > 0.039551 )
								if( tema <= 0.038242 )
									ret := 0.787879 // buy
								if( tema > 0.038242 )
									ret := -0.659794
						if( ema1 > 0.03971 )
							if( ema13 <= -0.000672 )
								if( tema <= 0.039419 )
									ret := 1.000000 // buy
								if( tema > 0.039419 )
									ret := 0.846154 // buy
							if( ema13 > -0.000672 )
								if( ema2 <= 0.040592 )
									ret := 0.475410
								if( ema2 > 0.040592 )
									ret := 0.974359 // buy
					if( ema3 > 0.04084 )
						if( ema3 <= 0.186145 )
							if( ema2 <= 0.180058 )
								if( ema1 <= 0.141436 )
									ret := 0.021575
								if( ema1 > 0.141436 )
									ret := 0.204394
							if( ema2 > 0.180058 )
								if( ema13 <= -0.002669 )
									ret := -0.128205
								if( ema13 > -0.002669 )
									ret := -0.834586 // sell
						if( ema3 > 0.186145 )
							if( tema <= 0.176456 )
								ret := -0.857143 // sell
							if( tema > 0.176456 )
								if( ema1 <= 0.186677 )
									ret := 0.817073 // buy
								if( ema1 > 0.186677 )
									ret := 0.516129
		if( ema3 > 0.193985 )
			if( ema12 <= -0.003287 )
				if( ema13 <= -0.012716 )
					if( ema12 <= -0.007714 )
						ret := -0.466667
					if( ema12 > -0.007714 )
						ret := -1.000000 // sell
				if( ema13 > -0.012716 )
					if( ema2 <= 0.244788 )
						if( tema <= 0.196448 )
							if( ema1 <= 0.200254 )
								if( ema3 <= 0.197824 )
									ret := 0.000000
								if( ema3 > 0.197824 )
									ret := 0.857143 // buy
							if( ema1 > 0.200254 )
								ret := -1.000000 // sell
						if( tema > 0.196448 )
							if( ema13 <= -0.006594 )
								if( ema1 <= 0.212038 )
									ret := 0.763158 // buy
								if( ema1 > 0.212038 )
									ret := 0.946429 // buy
							if( ema13 > -0.006594 )
								if( ema3 <= 0.232648 )
									ret := 0.500000
								if( ema3 > 0.232648 )
									ret := -0.071429
					if( ema2 > 0.244788 )
						ret := -0.700000 // sell
			if( ema12 > -0.003287 )
				if( ema2 <= 0.229808 )
					if( ema3 <= 0.195853 )
						if( ema2 <= 0.193646 )
							ret := -0.750000 // sell
						if( ema2 > 0.193646 )
							if( ema13 <= -0.001636 )
								ret := -0.900000 // sell
							if( ema13 > -0.001636 )
								ret := -1.000000 // sell
					if( ema3 > 0.195853 )
						if( tema <= 0.196567 )
							if( ema3 <= 0.199025 )
								if( ema2 <= 0.197624 )
									ret := 0.076923
								if( ema2 > 0.197624 )
									ret := 1.000000 // buy
							if( ema3 > 0.199025 )
								if( ema13 <= -0.005315 )
									ret := 0.769231 // buy
								if( ema13 > -0.005315 )
									ret := -0.444444
						if( tema > 0.196567 )
							if( ema12 <= -0.001767 )
								if( ema1 <= 0.211133 )
									ret := -0.622642
								if( ema1 > 0.211133 )
									ret := 0.183486
							if( ema12 > -0.001767 )
								if( ema3 <= 0.229001 )
									ret := -0.504762
								if( ema3 > 0.229001 )
									ret := 0.421053
				if( ema2 > 0.229808 )
					if( ema3 <= 0.239224 )
						if( ema2 <= 0.232254 )
							if( ema13 <= -0.005183 )
								ret := -0.857143 // sell
							if( ema13 > -0.005183 )
								if( tema <= 0.228164 )
									ret := -1.000000 // sell
								if( tema > 0.228164 )
									ret := -0.947368 // sell
						if( ema2 > 0.232254 )
							if( ema2 <= 0.23365 )
								ret := -0.333333
							if( ema2 > 0.23365 )
								if( ema12 <= -0.001215 )
									ret := -0.933333 // sell
								if( ema12 > -0.001215 )
									ret := -0.727273 // sell
					if( ema3 > 0.239224 )
						if( tema <= 0.237085 )
							ret := 0.500000
						if( tema > 0.237085 )
							if( ema3 <= 0.251216 )
								if( ema3 <= 0.240676 )
									ret := -0.733333 // sell
								if( ema3 > 0.240676 )
									ret := -0.103448
							if( ema3 > 0.251216 )
								if( ema12 <= -0.002926 )
									ret := -0.900000 // sell
								if( ema12 > -0.002926 )
									ret := -1.000000 // sell
	if( ema12 > -0.000112 )
		if( ema3 <= 0.022874 )
			if( ema2 <= 0.022965 )
				if( ema1 <= 0.009246 )
					if( ema1 <= 0.009206 )
						if( ema1 <= 0.009066 )
							ret := 1.000000 // buy
						if( ema1 > 0.009066 )
							ret := 0.363636
					if( ema1 > 0.009206 )
						ret := 1.000000 // buy
				if( ema1 > 0.009246 )
					if( ema13 <= -2.2e-05 )
						if( ema13 <= -0.000132 )
							if( ema1 <= 0.021223 )
								if( ema3 <= 0.021035 )
									ret := 0.030750
								if( ema3 > 0.021035 )
									ret := -0.466019
							if( ema1 > 0.021223 )
								if( ema1 <= 0.022601 )
									ret := 0.310212
								if( ema1 > 0.022601 )
									ret := -0.153846
						if( ema13 > -0.000132 )
							if( ema1 <= 0.011399 )
								if( tema <= 0.011299 )
									ret := -0.230384
								if( tema > 0.011299 )
									ret := -0.679012
							if( ema1 > 0.011399 )
								if( ema1 <= 0.011521 )
									ret := 0.601562
								if( ema1 > 0.011521 )
									ret := -0.052462
					if( ema13 > -2.2e-05 )
						if( ema2 <= 0.009679 )
							if( ema2 <= 0.009417 )
								if( ema13 <= 8.1e-05 )
									ret := -1.000000 // sell
								if( ema13 > 8.1e-05 )
									ret := 0.437500
							if( ema2 > 0.009417 )
								if( ema3 <= 0.009518 )
									ret := -0.933333 // sell
								if( ema3 > 0.009518 )
									ret := -0.750000 // sell
						if( ema2 > 0.009679 )
							if( ema3 <= 0.010946 )
								if( ema13 <= -1.1e-05 )
									ret := -0.375000
								if( ema13 > -1.1e-05 )
									ret := 0.406250
							if( ema3 > 0.010946 )
								if( ema3 <= 0.01179 )
									ret := -0.096343
								if( ema3 > 0.01179 )
									ret := 0.050668
			if( ema2 > 0.022965 )
				if( tema <= 0.02393 )
					if( ema2 <= 0.023005 )
						if( ema1 <= 0.023196 )
							ret := 0.600000
						if( ema1 > 0.023196 )
							ret := 0.400000
					if( ema2 > 0.023005 )
						if( ema12 <= 0.000235 )
							ret := 0.642857
						if( ema12 > 0.000235 )
							if( ema13 <= 0.000738 )
								ret := 1.000000 // buy
							if( ema13 > 0.000738 )
								ret := 0.869565 // buy
				if( tema > 0.02393 )
					if( ema12 <= 0.000455 )
						ret := -0.076923
					if( ema12 > 0.000455 )
						ret := 1.000000 // buy
		if( ema3 > 0.022874 )
			if( ema2 <= 0.042807 )
				if( ema13 <= -0.000149 )
					if( ema12 <= -2.6e-05 )
						if( ema2 <= 0.023141 )
							if( ema2 <= 0.022871 )
								if( tema <= 0.022729 )
									ret := 0.058824
								if( tema > 0.022729 )
									ret := -0.764706 // sell
							if( ema2 > 0.022871 )
								if( ema12 <= -8.3e-05 )
									ret := 0.450000
								if( ema12 > -8.3e-05 )
									ret := 0.025641
						if( ema2 > 0.023141 )
							if( tema <= 0.023413 )
								if( ema12 <= -8.6e-05 )
									ret := -0.415730
								if( ema12 > -8.6e-05 )
									ret := -0.721311 // sell
							if( tema > 0.023413 )
								if( ema3 <= 0.04221 )
									ret := -0.145423
								if( ema3 > 0.04221 )
									ret := -0.941176 // sell
					if( ema12 > -2.6e-05 )
						if( ema2 <= 0.034357 )
							if( ema1 <= 0.024321 )
								ret := -0.733333 // sell
							if( ema1 > 0.024321 )
								if( ema13 <= -0.000191 )
									ret := -0.842105 // sell
								if( ema13 > -0.000191 )
									ret := -0.100000
						if( ema2 > 0.034357 )
							if( tema <= 0.039437 )
								if( ema3 <= 0.038672 )
									ret := -0.789474 // sell
								if( ema3 > 0.038672 )
									ret := -0.964286 // sell
							if( tema > 0.039437 )
								if( ema2 <= 0.039917 )
									ret := -0.384615
								if( ema2 > 0.039917 )
									ret := -0.896552 // sell
				if( ema13 > -0.000149 )
					if( ema2 <= 0.041619 )
						if( ema13 <= 0.001554 )
							if( ema3 <= 0.023038 )
								if( tema <= 0.024316 )
									ret := -0.227865
								if( tema > 0.024316 )
									ret := 0.800000 // buy
							if( ema3 > 0.023038 )
								if( tema <= 0.023101 )
									ret := 0.254777
								if( tema > 0.023101 )
									ret := -0.057557
						if( ema13 > 0.001554 )
							if( tema <= 0.042528 )
								if( ema13 <= 0.002025 )
									ret := 0.888889 // buy
								if( ema13 > 0.002025 )
									ret := 0.181818
							if( tema > 0.042528 )
								ret := -0.133333
					if( ema2 > 0.041619 )
						if( ema3 <= 0.041933 )
							if( ema1 <= 0.043582 )
								if( ema12 <= 0.000122 )
									ret := -0.852459 // sell
								if( ema12 > 0.000122 )
									ret := -0.610687
							if( ema1 > 0.043582 )
								ret := -1.000000 // sell
						if( ema3 > 0.041933 )
							if( tema <= 0.042169 )
								if( ema1 <= 0.042246 )
									ret := -0.079545
								if( ema1 > 0.042246 )
									ret := 1.000000 // buy
							if( tema > 0.042169 )
								if( ema12 <= 0.000381 )
									ret := -0.600897
								if( ema12 > 0.000381 )
									ret := 0.666667
			if( ema2 > 0.042807 )
				if( tema <= 0.044376 )
					if( ema1 <= 0.044123 )
						if( tema <= 0.044091 )
							if( ema3 <= 0.043348 )
								if( ema3 <= 0.042776 )
									ret := 0.967742 // buy
								if( ema3 > 0.042776 )
									ret := 0.388889
							if( ema3 > 0.043348 )
								if( ema2 <= 0.043514 )
									ret := 0.794118 // buy
								if( ema2 > 0.043514 )
									ret := 0.928571 // buy
						if( tema > 0.044091 )
							if( ema12 <= 0.000296 )
								if( ema13 <= 6.3e-05 )
									ret := 0.555556
								if( ema13 > 6.3e-05 )
									ret := 0.833333 // buy
							if( ema12 > 0.000296 )
								ret := 0.263158
					if( ema1 > 0.044123 )
						if( ema2 <= 0.044238 )
							ret := -0.590909
						if( ema2 > 0.044238 )
							if( ema13 <= 8.9e-05 )
								if( ema3 <= 0.04456 )
									ret := -0.093750
								if( ema3 > 0.04456 )
									ret := 1.000000 // buy
							if( ema13 > 8.9e-05 )
								ret := 1.000000 // buy
				if( tema > 0.044376 )
					if( ema13 <= 0.002682 )
						if( ema13 <= -0.000208 )
							if( ema3 <= 0.047639 )
								if( ema13 <= -0.000223 )
									ret := 0.673913
								if( ema13 > -0.000223 )
									ret := -0.200000
							if( ema3 > 0.047639 )
								if( ema2 <= 0.228451 )
									ret := -0.245378
								if( ema2 > 0.228451 )
									ret := 0.800000 // buy
						if( ema13 > -0.000208 )
							if( ema1 <= 0.045829 )
								if( tema <= 0.0456 )
									ret := 0.006477
								if( tema > 0.0456 )
									ret := -0.508306
							if( ema1 > 0.045829 )
								if( ema13 <= 0.002655 )
									ret := 0.020374
								if( ema13 > 0.002655 )
									ret := 0.718750 // buy
					if( ema13 > 0.002682 )
						if( ema13 <= 0.013292 )
							if( ema2 <= 0.234312 )
								if( ema3 <= 0.133351 )
									ret := -0.236292
								if( ema3 > 0.133351 )
									ret := -0.004617
							if( ema2 > 0.234312 )
								if( tema <= 0.256142 )
									ret := -0.431579
								if( tema > 0.256142 )
									ret := -1.000000 // sell
						if( ema13 > 0.013292 )
							if( ema12 <= 0.013558 )
								if( ema1 <= 0.243778 )
									ret := 0.887500 // buy
								if( ema1 > 0.243778 )
									ret := -0.285714
							if( ema12 > 0.013558 )
								ret := -0.900000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_VETUSDT_30Min_03b94939(ema2, tema, ema12, ema3, ema1, ema13)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


