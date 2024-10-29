//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: MSFT_5Min_2TV0_d8cc4361 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2TV0_d8cc4361", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_d8cc4361(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.001314 )
		if( tema <= 321.123 )
			if( ema13 <= -0.371015 )
				if( VIM <= 1.07062 )
					if( ema13 <= -0.661812 )
						if( ema3 <= 306.294 )
							ret := 0.800000 // buy
						if( ema3 > 306.294 )
							if( ema2 <= 313.071 )
								ret := -0.333333
							if( ema2 > 313.071 )
								ret := -1.000000 // sell
					if( ema13 > -0.661812 )
						if( tema <= 317.892 )
							if( VIP <= 0.955029 )
								if( VIP_VIM <= -0.12589 )
									ret := 0.882353 // buy
								if( VIP_VIM > -0.12589 )
									ret := 0.694444
							if( VIP > 0.955029 )
								if( ema13 <= -0.484185 )
									ret := -0.090909
								if( ema13 > -0.484185 )
									ret := 0.533333
						if( tema > 317.892 )
							if( VIP <= 0.875405 )
								ret := -0.750000 // sell
							if( VIP > 0.875405 )
								if( ema1 <= 319.652 )
									ret := -0.250000
								if( ema1 > 319.652 )
									ret := 1.000000 // buy
				if( VIM > 1.07062 )
					if( VIM <= 1.18254 )
						if( ema3 <= 306.664 )
							if( tema <= 276.612 )
								ret := 1.000000 // buy
							if( tema > 276.612 )
								if( ema2 <= 280.177 )
									ret := -0.444444
								if( ema2 > 280.177 )
									ret := 0.508475
						if( ema3 > 306.664 )
							if( ema13 <= -0.760625 )
								if( ema3 <= 321.744 )
									ret := -0.584906
								if( ema3 > 321.744 )
									ret := 1.000000 // buy
							if( ema13 > -0.760625 )
								if( VIP <= 0.898638 )
									ret := 0.226054
								if( VIP > 0.898638 )
									ret := -0.239316
					if( VIM > 1.18254 )
						if( ema2 <= 297.673 )
							if( ema12 <= -0.80133 )
								if( VIM <= 1.31866 )
									ret := 0.400000
								if( VIM > 1.31866 )
									ret := 1.000000 // buy
							if( ema12 > -0.80133 )
								if( ema3 <= 297.67 )
									ret := -0.061728
								if( ema3 > 297.67 )
									ret := -0.818182 // sell
						if( ema2 > 297.673 )
							if( tema <= 304.731 )
								if( ema13 <= -0.616511 )
									ret := 0.944444 // buy
								if( ema13 > -0.616511 )
									ret := 0.700000 // buy
							if( tema > 304.731 )
								if( VIM <= 3.61384 )
									ret := 0.337589
								if( VIM > 3.61384 )
									ret := -0.166667
			if( ema13 > -0.371015 )
				if( ema2 <= 284.325 )
					if( tema <= 283.634 )
						if( ema12 <= -0.243493 )
							ret := 1.000000 // buy
						if( ema12 > -0.243493 )
							if( VIP <= 0.848305 )
								ret := 0.500000
							if( VIP > 0.848305 )
								if( tema <= 277.94 )
									ret := -0.846154 // sell
								if( tema > 277.94 )
									ret := -0.277778
					if( tema > 283.634 )
						if( VIM <= 1.09471 )
							ret := -1.000000 // sell
						if( VIM > 1.09471 )
							ret := -0.750000 // sell
				if( ema2 > 284.325 )
					if( ema1 <= 295.64 )
						if( ema3 <= 295.436 )
							if( ema13 <= 0.024116 )
								ret := 1.000000 // buy
							if( ema13 > 0.024116 )
								ret := 0.500000
						if( ema3 > 295.436 )
							if( ema13 <= -0.186775 )
								ret := 0.000000
							if( ema13 > -0.186775 )
								if( tema <= 295.209 )
									ret := 0.200000
								if( tema > 295.209 )
									ret := 0.916667 // buy
					if( ema1 > 295.64 )
						if( ema2 <= 297.951 )
							if( ema3 <= 296.576 )
								if( VIM <= 1.29889 )
									ret := 0.187500
								if( VIM > 1.29889 )
									ret := -0.800000 // sell
							if( ema3 > 296.576 )
								ret := -1.000000 // sell
						if( ema2 > 297.951 )
							if( ema13 <= -0.015718 )
								if( VIP_VIM <= -0.041531 )
									ret := 0.173398
								if( VIP_VIM > -0.041531 )
									ret := -0.094688
							if( ema13 > -0.015718 )
								if( tema <= 320.834 )
									ret := 0.310680
								if( tema > 320.834 )
									ret := 0.958333 // buy
		if( tema > 321.123 )
			if( VIP_VIM <= -0.48512 )
				if( ema3 <= 462.43 )
					if( ema1 <= 385.731 )
						if( ema3 <= 375.068 )
							if( ema2 <= 330.449 )
								if( ema2 <= 327.067 )
									ret := 0.054711
								if( ema2 > 327.067 )
									ret := 0.456395
							if( ema2 > 330.449 )
								if( ema2 <= 331.234 )
									ret := -0.354545
								if( ema2 > 331.234 )
									ret := 0.098063
						if( ema3 > 375.068 )
							if( VIM <= 1.28858 )
								if( ema13 <= -0.769199 )
									ret := -0.909091 // sell
								if( ema13 > -0.769199 )
									ret := -0.529412
							if( VIM > 1.28858 )
								if( ema12 <= -0.80886 )
									ret := 0.147059
								if( ema12 > -0.80886 )
									ret := -0.416185
					if( ema1 > 385.731 )
						if( tema <= 400.982 )
							if( ema2 <= 400.751 )
								if( ema2 <= 400.271 )
									ret := 0.418605
								if( ema2 > 400.271 )
									ret := -0.678571
							if( ema2 > 400.751 )
								if( VIP_VIM <= -0.579783 )
									ret := 0.795699 // buy
								if( VIP_VIM > -0.579783 )
									ret := 0.375000
						if( tema > 400.982 )
							if( VIM <= 2.79888 )
								if( ema13 <= -0.379127 )
									ret := 0.159737
								if( ema13 > -0.379127 )
									ret := -0.001730
							if( VIM > 2.79888 )
								if( ema13 <= -0.137572 )
									ret := 0.428994
								if( ema13 > -0.137572 )
									ret := 0.018349
				if( ema3 > 462.43 )
					if( ema1 <= 466.763 )
						if( ema12 <= -0.873539 )
							ret := -1.000000 // sell
						if( ema12 > -0.873539 )
							if( tema <= 463.947 )
								ret := -0.142857
							if( tema > 463.947 )
								if( VIP_VIM <= -0.779977 )
									ret := -0.500000
								if( VIP_VIM > -0.779977 )
									ret := -1.000000 // sell
					if( ema1 > 466.763 )
						ret := 0.200000
			if( VIP_VIM > -0.48512 )
				if( ema12 <= -0.53858 )
					if( ema2 <= 442.93 )
						if( ema12 <= -1.22476 )
							if( ema3 <= 433.491 )
								if( VIP <= 1.35073 )
									ret := 0.470000
								if( VIP > 1.35073 )
									ret := -0.904762 // sell
							if( ema3 > 433.491 )
								if( ema2 <= 436.621 )
									ret := -1.000000 // sell
								if( ema2 > 436.621 )
									ret := -0.250000
						if( ema12 > -1.22476 )
							if( tema <= 435.072 )
								if( ema13 <= -2.35006 )
									ret := 0.750000 // buy
								if( ema13 > -2.35006 )
									ret := -0.135636
							if( tema > 435.072 )
								if( VIP <= 0.784604 )
									ret := 0.000000
								if( VIP > 0.784604 )
									ret := -0.814286 // sell
					if( ema2 > 442.93 )
						if( ema3 <= 462.415 )
							if( VIM <= 1.14614 )
								if( ema1 <= 453.614 )
									ret := 1.000000 // buy
								if( ema1 > 453.614 )
									ret := 0.750000 // buy
							if( VIM > 1.14614 )
								if( VIP_VIM <= -0.403308 )
									ret := 0.700000 // buy
								if( VIP_VIM > -0.403308 )
									ret := 0.000000
						if( ema3 > 462.415 )
							ret := -1.000000 // sell
				if( ema12 > -0.53858 )
					if( ema1 <= 432.144 )
						if( ema12 <= -0.230716 )
							if( ema3 <= 328.649 )
								if( tema <= 325.876 )
									ret := 0.088339
								if( tema > 325.876 )
									ret := 0.523316
							if( ema3 > 328.649 )
								if( ema3 <= 333.202 )
									ret := -0.090016
								if( ema3 > 333.202 )
									ret := 0.103407
						if( ema12 > -0.230716 )
							if( ema13 <= 0.262728 )
								if( ema3 <= 340.504 )
									ret := -0.020874
								if( ema3 > 340.504 )
									ret := 0.050818
							if( ema13 > 0.262728 )
								if( ema3 <= 417.765 )
									ret := 0.600000
								if( ema3 > 417.765 )
									ret := -0.300000
					if( ema1 > 432.144 )
						if( tema <= 433.728 )
							if( VIP_VIM <= -0.387086 )
								if( VIP <= 0.738994 )
									ret := -1.000000 // sell
								if( VIP > 0.738994 )
									ret := 0.583333
							if( VIP_VIM > -0.387086 )
								if( VIP <= 1.99302 )
									ret := 0.738739 // buy
								if( VIP > 1.99302 )
									ret := -0.500000
						if( tema > 433.728 )
							if( VIP <= 1.24016 )
								if( ema3 <= 461.214 )
									ret := 0.244898
								if( ema3 > 461.214 )
									ret := -0.078125
							if( VIP > 1.24016 )
								if( VIP_VIM <= 0.602258 )
									ret := -0.156425
								if( VIP_VIM > 0.602258 )
									ret := 0.514286
	if( ema12 > -0.001314 )
		if( VIP_VIM <= 0.757033 )
			if( ema2 <= 410.327 )
				if( ema1 <= 349.567 )
					if( ema1 <= 331.822 )
						if( tema <= 329.601 )
							if( VIM <= 1.02087 )
								if( ema2 <= 296.318 )
									ret := 0.353982
								if( ema2 > 296.318 )
									ret := 0.050496
							if( VIM > 1.02087 )
								if( ema2 <= 329.209 )
									ret := -0.084492
								if( ema2 > 329.209 )
									ret := 0.516129
						if( tema > 329.601 )
							if( ema3 <= 328.997 )
								if( VIM <= 0.708818 )
									ret := 0.214286
								if( VIM > 0.708818 )
									ret := 0.752577 // buy
							if( ema3 > 328.997 )
								if( VIM <= 0.707766 )
									ret := -0.487805
								if( VIM > 0.707766 )
									ret := 0.221973
					if( ema1 > 331.822 )
						if( ema13 <= 1.15192 )
							if( ema2 <= 336.962 )
								if( ema1 <= 336.462 )
									ret := -0.028399
								if( ema1 > 336.462 )
									ret := 0.476190
							if( ema2 > 336.962 )
								if( ema3 <= 337.096 )
									ret := -0.644628
								if( ema3 > 337.096 )
									ret := -0.108247
						if( ema13 > 1.15192 )
							if( tema <= 338.674 )
								if( ema2 <= 331.841 )
									ret := -0.276923
								if( ema2 > 331.841 )
									ret := -0.785714 // sell
							if( tema > 338.674 )
								if( ema3 <= 338.616 )
									ret := 0.454545
								if( ema3 > 338.616 )
									ret := -0.383648
				if( ema1 > 349.567 )
					if( ema1 <= 410.176 )
						if( VIP <= 4.48109 )
							if( ema13 <= 0.304656 )
								if( tema <= 359.641 )
									ret := 0.437838
								if( tema > 359.641 )
									ret := 0.121878
							if( ema13 > 0.304656 )
								if( ema3 <= 405.721 )
									ret := 0.074253
								if( ema3 > 405.721 )
									ret := -0.084838
						if( VIP > 4.48109 )
							if( ema12 <= 0.019139 )
								if( VIM <= 6.30201 )
									ret := 0.500000
								if( VIM > 6.30201 )
									ret := 0.000000
							if( ema12 > 0.019139 )
								if( ema3 <= 407.649 )
									ret := -0.500000
								if( ema3 > 407.649 )
									ret := 0.083333
					if( ema1 > 410.176 )
						if( ema13 <= 1.94471 )
							if( tema <= 411.604 )
								if( VIM <= 0.867237 )
									ret := 0.782609 // buy
								if( VIM > 0.867237 )
									ret := 0.203125
							if( tema > 411.604 )
								if( ema3 <= 409.305 )
									ret := -0.800000 // sell
								if( ema3 > 409.305 )
									ret := 0.000000
						if( ema13 > 1.94471 )
							if( VIM <= 0.696923 )
								if( VIM <= 0.619352 )
									ret := 1.000000 // buy
								if( VIM > 0.619352 )
									ret := 0.400000
							if( VIM > 0.696923 )
								ret := 1.000000 // buy
			if( ema2 > 410.327 )
				if( ema13 <= 3.07929 )
					if( ema1 <= 413.151 )
						if( ema1 <= 412.87 )
							if( ema3 <= 410.143 )
								if( VIM <= 0.689597 )
									ret := 0.500000
								if( VIM > 0.689597 )
									ret := -0.707317 // sell
							if( ema3 > 410.143 )
								if( ema13 <= 1.26288 )
									ret := -0.071429
								if( ema13 > 1.26288 )
									ret := 0.545455
						if( ema1 > 412.87 )
							if( VIP_VIM <= -0.078859 )
								if( VIP <= 1.24539 )
									ret := 0.000000
								if( VIP > 1.24539 )
									ret := 0.733333 // buy
							if( VIP_VIM > -0.078859 )
								if( ema3 <= 412.858 )
									ret := -0.543046
								if( ema3 > 412.858 )
									ret := 0.263158
					if( ema1 > 413.151 )
						if( ema1 <= 413.481 )
							if( ema1 <= 413.283 )
								if( VIP <= 1.24137 )
									ret := 0.195122
								if( VIP > 1.24137 )
									ret := -0.080000
							if( ema1 > 413.283 )
								if( ema12 <= 0.064729 )
									ret := -0.272727
								if( ema12 > 0.064729 )
									ret := 0.634409
						if( ema1 > 413.481 )
							if( VIP_VIM <= 0.07291 )
								if( ema3 <= 443.773 )
									ret := -0.085870
								if( ema3 > 443.773 )
									ret := 0.107273
							if( VIP_VIM > 0.07291 )
								if( VIP_VIM <= 0.205506 )
									ret := 0.086039
								if( VIP_VIM > 0.205506 )
									ret := -0.016524
				if( ema13 > 3.07929 )
					if( VIP_VIM <= 0.51896 )
						ret := -1.000000 // sell
					if( VIP_VIM > 0.51896 )
						if( ema13 <= 3.30639 )
							ret := -0.666667
						if( ema13 > 3.30639 )
							ret := -1.000000 // sell
		if( VIP_VIM > 0.757033 )
			if( ema1 <= 420.584 )
				if( ema12 <= 1.54106 )
					if( ema12 <= 0.194609 )
						if( tema <= 376.372 )
							if( VIP <= 2.45657 )
								if( VIM <= 0.935837 )
									ret := 0.058824
								if( VIM > 0.935837 )
									ret := -0.394737
							if( VIP > 2.45657 )
								if( ema2 <= 306.225 )
									ret := 0.666667
								if( ema2 > 306.225 )
									ret := -0.027586
						if( tema > 376.372 )
							if( ema2 <= 417.964 )
								if( ema13 <= 0.38396 )
									ret := 0.132867
								if( ema13 > 0.38396 )
									ret := 0.592593
							if( ema2 > 417.964 )
								if( ema12 <= 0.144359 )
									ret := -1.000000 // sell
								if( ema12 > 0.144359 )
									ret := 0.000000
					if( ema12 > 0.194609 )
						if( ema2 <= 320.04 )
							if( ema1 <= 317.31 )
								if( ema13 <= 2.58491 )
									ret := -0.175676
								if( ema13 > 2.58491 )
									ret := 1.000000 // buy
							if( ema1 > 317.31 )
								if( VIP_VIM <= 1.07495 )
									ret := -0.934783 // sell
								if( VIP_VIM > 1.07495 )
									ret := -0.300000
						if( ema2 > 320.04 )
							if( tema <= 324.619 )
								if( ema2 <= 322.6 )
									ret := 0.000000
								if( ema2 > 322.6 )
									ret := 0.666667
							if( tema > 324.619 )
								if( tema <= 332.802 )
									ret := -0.384615
								if( tema > 332.802 )
									ret := -0.159919
				if( ema12 > 1.54106 )
					if( ema3 <= 350.749 )
						if( ema12 <= 1.66998 )
							if( ema2 <= 337.959 )
								if( tema <= 341.466 )
									ret := 0.750000 // buy
								if( tema > 341.466 )
									ret := 1.000000 // buy
							if( ema2 > 337.959 )
								ret := 0.000000
						if( ema12 > 1.66998 )
							if( ema3 <= 339.046 )
								ret := 0.800000 // buy
							if( ema3 > 339.046 )
								ret := 1.000000 // buy
					if( ema3 > 350.749 )
						if( VIM <= 0.678678 )
							if( VIM <= 0.560556 )
								if( VIP_VIM <= 0.924513 )
									ret := -0.571429
								if( VIP_VIM > 0.924513 )
									ret := -1.000000 // sell
							if( VIM > 0.560556 )
								if( VIP_VIM <= 0.792728 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.792728 )
									ret := -0.111111
						if( VIM > 0.678678 )
							if( ema12 <= 1.73189 )
								ret := 0.400000
							if( ema12 > 1.73189 )
								ret := 1.000000 // buy
			if( ema1 > 420.584 )
				if( ema12 <= 0.72928 )
					if( ema1 <= 421.698 )
						if( VIM <= 1.86457 )
							if( VIP <= 1.94306 )
								ret := 0.250000
							if( VIP > 1.94306 )
								ret := 0.000000
						if( VIM > 1.86457 )
							if( ema13 <= 0.408612 )
								if( tema <= 421.572 )
									ret := 0.250000
								if( tema > 421.572 )
									ret := 1.000000 // buy
							if( ema13 > 0.408612 )
								ret := 1.000000 // buy
					if( ema1 > 421.698 )
						if( ema12 <= 0.192995 )
							if( ema3 <= 436.812 )
								if( ema2 <= 431.214 )
									ret := 0.000000
								if( ema2 > 431.214 )
									ret := -0.625000
							if( ema3 > 436.812 )
								if( ema1 <= 452.715 )
									ret := 0.714286 // buy
								if( ema1 > 452.715 )
									ret := 0.000000
						if( ema12 > 0.192995 )
							if( tema <= 426.313 )
								if( ema1 <= 422.29 )
									ret := -0.500000
								if( ema1 > 422.29 )
									ret := 0.297872
							if( tema > 426.313 )
								if( tema <= 428.33 )
									ret := -0.520000
								if( tema > 428.33 )
									ret := -0.141593
				if( ema12 > 0.72928 )
					if( ema12 <= 1.30897 )
						if( tema <= 448.588 )
							if( VIP <= 1.46391 )
								ret := 1.000000 // buy
							if( VIP > 1.46391 )
								if( ema1 <= 437.648 )
									ret := 0.775862 // buy
								if( ema1 > 437.648 )
									ret := 0.076923
						if( tema > 448.588 )
							if( ema2 <= 458.242 )
								ret := 0.000000
							if( ema2 > 458.242 )
								ret := -0.500000
					if( ema12 > 1.30897 )
						if( ema2 <= 428.827 )
							ret := -1.000000 // sell
						if( ema2 > 428.827 )
							ret := 0.166667
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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



//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_MSFT_5Min_d8cc4361(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


