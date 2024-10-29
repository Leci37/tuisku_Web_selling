//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: MSFT_1Min_2BT0_8411a5bf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2BT0_8411a5bf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_8411a5bf(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.382989 )
		if( bbm <= 0.129921 )
			if( bearPower <= -0.551306 )
				if( ema12 <= -1.17961 )
					if( tema <= 405.365 )
						ret := 1.000000 // buy
					if( tema > 405.365 )
						if( bearPower <= -2.29603 )
							ret := 0.000000
						if( bearPower > -2.29603 )
							if( ema2 <= 421.689 )
								ret := -1.000000 // sell
							if( ema2 > 421.689 )
								if( tema <= 443.511 )
									ret := 0.000000
								if( tema > 443.511 )
									ret := -1.000000 // sell
				if( ema12 > -1.17961 )
					if( ema3 <= 397.735 )
						if( ema12 <= -0.943439 )
							ret := 1.000000 // buy
						if( ema12 > -0.943439 )
							if( ema13 <= -0.621386 )
								if( ema13 <= -1.08077 )
									ret := 0.000000
								if( ema13 > -1.08077 )
									ret := -1.000000 // sell
							if( ema13 > -0.621386 )
								if( bbp <= -1.44685 )
									ret := 0.750000 // buy
								if( bbp > -1.44685 )
									ret := -1.000000 // sell
					if( ema3 > 397.735 )
						if( ema3 <= 454.892 )
							if( ema2 <= 454.231 )
								if( bullPower <= -0.98045 )
									ret := 0.664430
								if( bullPower > -0.98045 )
									ret := 0.374801
							if( ema2 > 454.231 )
								if( tema <= 453.574 )
									ret := -1.000000 // sell
								if( tema > 453.574 )
									ret := -0.250000
						if( ema3 > 454.892 )
							if( ema12 <= -0.326838 )
								ret := 1.000000 // buy
							if( ema12 > -0.326838 )
								if( bbp <= -1.15174 )
									ret := 0.521739
								if( bbp > -1.15174 )
									ret := 1.000000 // buy
			if( bearPower > -0.551306 )
				if( ema3 <= 460.137 )
					if( ema13 <= 0.074911 )
						if( ema13 <= -0.209776 )
							if( bbm <= 9e-06 )
								if( tema <= 403.241 )
									ret := 0.336449
								if( tema > 403.241 )
									ret := 0.074481
							if( bbm > 9e-06 )
								if( ema12 <= -0.404541 )
									ret := -0.380952
								if( ema12 > -0.404541 )
									ret := 0.244361
						if( ema13 > -0.209776 )
							if( ema12 <= -0.084861 )
								if( bullPower <= -0.288214 )
									ret := 0.137809
								if( bullPower > -0.288214 )
									ret := -0.060440
							if( ema12 > -0.084861 )
								if( ema2 <= 435.604 )
									ret := 0.221973
								if( ema2 > 435.604 )
									ret := -0.057971
					if( ema13 > 0.074911 )
						if( ema2 <= 413.16 )
							if( ema2 <= 397.476 )
								if( bbp <= -0.52738 )
									ret := -0.555556
								if( bbp > -0.52738 )
									ret := 0.777778 // buy
							if( ema2 > 397.476 )
								if( bearPower <= -0.219743 )
									ret := 0.836735 // buy
								if( bearPower > -0.219743 )
									ret := 0.375000
						if( ema2 > 413.16 )
							if( ema2 <= 420.622 )
								if( ema12 <= -0.022102 )
									ret := 0.714286 // buy
								if( ema12 > -0.022102 )
									ret := -0.204545
							if( ema2 > 420.622 )
								if( tema <= 431.303 )
									ret := 0.765957 // buy
								if( tema > 431.303 )
									ret := 0.313433
				if( ema3 > 460.137 )
					if( bbm <= 0.029509 )
						if( ema1 <= 467.967 )
							if( ema2 <= 466.701 )
								if( ema3 <= 460.393 )
									ret := 1.000000 // buy
								if( ema3 > 460.393 )
									ret := 0.611111
							if( ema2 > 466.701 )
								ret := 0.000000
						if( ema1 > 467.967 )
							ret := 1.000000 // buy
					if( bbm > 0.029509 )
						if( bbm <= 0.12155 )
							if( tema <= 466.106 )
								if( ema2 <= 465.534 )
									ret := -0.090909
								if( ema2 > 465.534 )
									ret := -0.500000
							if( tema > 466.106 )
								if( ema13 <= -0.187799 )
									ret := 0.000000
								if( ema13 > -0.187799 )
									ret := 0.250000
						if( bbm > 0.12155 )
							ret := 0.750000 // buy
		if( bbm > 0.129921 )
			if( bbm <= 0.730811 )
				if( ema13 <= -1.74327 )
					if( ema2 <= 400.379 )
						if( ema13 <= -1.91873 )
							ret := 1.000000 // buy
						if( ema13 > -1.91873 )
							ret := 0.333333
					if( ema2 > 400.379 )
						if( bearPower <= -1.54608 )
							if( ema3 <= 418.086 )
								if( bbm <= 0.41241 )
									ret := 0.000000
								if( bbm > 0.41241 )
									ret := -0.842105 // sell
							if( ema3 > 418.086 )
								if( ema1 <= 433.27 )
									ret := 0.363636
								if( ema1 > 433.27 )
									ret := -0.421053
						if( bearPower > -1.54608 )
							if( ema2 <= 413.536 )
								ret := 0.000000
							if( ema2 > 413.536 )
								if( ema3 <= 427.17 )
									ret := -1.000000 // sell
								if( ema3 > 427.17 )
									ret := -0.580645
				if( ema13 > -1.74327 )
					if( ema2 <= 405.685 )
						if( ema1 <= 402.864 )
							if( bullPower <= -0.181671 )
								if( tema <= 399.875 )
									ret := -0.140827
								if( tema > 399.875 )
									ret := 0.182891
							if( bullPower > -0.181671 )
								if( ema1 <= 392.162 )
									ret := 0.607843
								if( ema1 > 392.162 )
									ret := 0.189911
						if( ema1 > 402.864 )
							if( ema12 <= -0.412101 )
								if( bbm <= 0.254367 )
									ret := -0.100000
								if( bbm > 0.254367 )
									ret := -0.834711 // sell
							if( ema12 > -0.412101 )
								if( bearPower <= -0.634763 )
									ret := 0.102041
								if( bearPower > -0.634763 )
									ret := -0.206304
					if( ema2 > 405.685 )
						if( ema1 <= 406.436 )
							if( bbm <= 0.305268 )
								if( ema13 <= -0.133442 )
									ret := 0.017391
								if( ema13 > -0.133442 )
									ret := 0.681818
							if( bbm > 0.305268 )
								if( ema13 <= -0.885886 )
									ret := 0.373134
								if( ema13 > -0.885886 )
									ret := 0.727811 // buy
						if( ema1 > 406.436 )
							if( tema <= 422.894 )
								if( tema <= 420.756 )
									ret := 0.068677
								if( tema > 420.756 )
									ret := -0.187384
							if( tema > 422.894 )
								if( ema1 <= 426.577 )
									ret := 0.275132
								if( ema1 > 426.577 )
									ret := 0.096176
			if( bbm > 0.730811 )
				if( tema <= 389.525 )
					if( bbp <= -1.04879 )
						if( bbm <= 0.761607 )
							ret := 0.166667
						if( bbm > 0.761607 )
							if( bullPower <= 0.139032 )
								if( ema1 <= 389.284 )
									ret := 0.850000 // buy
								if( ema1 > 389.284 )
									ret := 1.000000 // buy
							if( bullPower > 0.139032 )
								ret := 0.500000
					if( bbp > -1.04879 )
						ret := -0.800000 // sell
				if( tema > 389.525 )
					if( ema12 <= -0.106884 )
						if( ema13 <= -1.08714 )
							if( tema <= 421.853 )
								if( tema <= 410.177 )
									ret := -0.101449
								if( tema > 410.177 )
									ret := 0.541353
							if( tema > 421.853 )
								if( ema13 <= -1.95615 )
									ret := 0.705882 // buy
								if( ema13 > -1.95615 )
									ret := -0.328125
						if( ema13 > -1.08714 )
							if( ema13 <= 0.22987 )
								if( ema1 <= 406.619 )
									ret := 0.129477
								if( ema1 > 406.619 )
									ret := 0.333031
							if( ema13 > 0.22987 )
								ret := -1.000000 // sell
					if( ema12 > -0.106884 )
						if( ema2 <= 397.241 )
							if( ema1 <= 390.926 )
								ret := 1.000000 // buy
							if( ema1 > 390.926 )
								if( ema12 <= 0.010345 )
									ret := -0.166667
								if( ema12 > 0.010345 )
									ret := 0.916667 // buy
						if( ema2 > 397.241 )
							if( bbm <= 0.870938 )
								if( ema12 <= 0.095044 )
									ret := 0.348485
								if( ema12 > 0.095044 )
									ret := -0.545455
							if( bbm > 0.870938 )
								if( tema <= 414.992 )
									ret := 0.000000
								if( tema > 414.992 )
									ret := -0.374194
	if( bbp > -0.382989 )
		if( ema13 <= 0.498388 )
			if( tema <= 397.793 )
				if( bbp <= 1.1572 )
					if( ema13 <= -0.079084 )
						if( ema2 <= 396.459 )
							if( ema2 <= 389.905 )
								if( bbm <= 0.09405 )
									ret := 0.153846
								if( bbm > 0.09405 )
									ret := 0.956522 // buy
							if( ema2 > 389.905 )
								if( ema13 <= -0.115734 )
									ret := 0.148855
								if( ema13 > -0.115734 )
									ret := 0.628205
						if( ema2 > 396.459 )
							if( ema2 <= 396.796 )
								if( bbp <= -0.242035 )
									ret := 0.400000
								if( bbp > -0.242035 )
									ret := 0.895522 // buy
							if( ema2 > 396.796 )
								if( ema12 <= 0.004256 )
									ret := 0.531746
								if( ema12 > 0.004256 )
									ret := -0.250000
					if( ema13 > -0.079084 )
						if( ema3 <= 397.509 )
							if( ema3 <= 397.157 )
								if( bullPower <= -0.093099 )
									ret := 0.722222 // buy
								if( bullPower > -0.093099 )
									ret := 0.165189
							if( ema3 > 397.157 )
								if( bbm <= 0.235694 )
									ret := 0.085106
								if( bbm > 0.235694 )
									ret := -0.769231 // sell
						if( ema3 > 397.509 )
							if( ema2 <= 397.721 )
								if( ema1 <= 397.669 )
									ret := 0.750000 // buy
								if( ema1 > 397.669 )
									ret := 0.181818
							if( ema2 > 397.721 )
								ret := 1.000000 // buy
				if( bbp > 1.1572 )
					if( ema2 <= 389.95 )
						if( bbp <= 2.3013 )
							ret := 1.000000 // buy
						if( bbp > 2.3013 )
							ret := 0.166667
					if( ema2 > 389.95 )
						if( bullPower <= 2.39185 )
							if( ema3 <= 390.927 )
								if( ema12 <= 0.293706 )
									ret := -0.969697 // sell
								if( ema12 > 0.293706 )
									ret := -0.750000 // sell
							if( ema3 > 390.927 )
								if( ema1 <= 392.955 )
									ret := 0.461538
								if( ema1 > 392.955 )
									ret := -0.600000
						if( bullPower > 2.39185 )
							ret := 1.000000 // buy
			if( tema > 397.793 )
				if( ema1 <= 467.456 )
					if( ema2 <= 422.542 )
						if( ema12 <= 0.072279 )
							if( bullPower <= 0.102909 )
								if( ema1 <= 419.638 )
									ret := 0.046228
								if( ema1 > 419.638 )
									ret := 0.158444
							if( bullPower > 0.102909 )
								if( ema12 <= -0.211999 )
									ret := 0.278351
								if( ema12 > -0.211999 )
									ret := -0.013659
						if( ema12 > 0.072279 )
							if( ema3 <= 397.542 )
								if( ema13 <= 0.411723 )
									ret := -0.672727
								if( ema13 > 0.411723 )
									ret := 0.437500
							if( ema3 > 397.542 )
								if( bbp <= 0.625445 )
									ret := 0.115031
								if( bbp > 0.625445 )
									ret := 0.018089
					if( ema2 > 422.542 )
						if( bbp <= 1.90884 )
							if( bullPower <= 0.159365 )
								if( ema2 <= 422.61 )
									ret := -0.542857
								if( ema2 > 422.61 )
									ret := -0.007063
							if( bullPower > 0.159365 )
								if( bbm <= 0.006622 )
									ret := -0.156046
								if( bbm > 0.006622 )
									ret := 0.058378
						if( bbp > 1.90884 )
							if( bullPower <= 1.70165 )
								if( ema3 <= 429.969 )
									ret := -1.000000 // sell
								if( ema3 > 429.969 )
									ret := -0.678571
							if( bullPower > 1.70165 )
								if( ema12 <= 0.309522 )
									ret := 0.823529 // buy
								if( ema12 > 0.309522 )
									ret := -0.500000
				if( ema1 > 467.456 )
					if( bullPower <= -0.112585 )
						ret := 0.714286 // buy
					if( bullPower > -0.112585 )
						if( ema1 <= 467.671 )
							if( tema <= 467.626 )
								if( ema12 <= 0.051716 )
									ret := -0.904762 // sell
								if( ema12 > 0.051716 )
									ret := -0.272727
							if( tema > 467.626 )
								if( ema12 <= 0.167817 )
									ret := -1.000000 // sell
								if( ema12 > 0.167817 )
									ret := -0.714286 // sell
						if( ema1 > 467.671 )
							if( tema <= 468.046 )
								if( bbp <= 0.161661 )
									ret := -0.133333
								if( bbp > 0.161661 )
									ret := 0.625000
							if( tema > 468.046 )
								if( bbm <= 0.002616 )
									ret := -0.266667
								if( bbm > 0.002616 )
									ret := -0.740741 // sell
		if( ema13 > 0.498388 )
			if( ema2 <= 405.193 )
				if( ema1 <= 402.989 )
					if( ema1 <= 399.853 )
						if( ema12 <= 0.900783 )
							if( ema13 <= 0.742808 )
								if( ema3 <= 398.384 )
									ret := 0.036290
								if( ema3 > 398.384 )
									ret := -0.575758
							if( ema13 > 0.742808 )
								if( ema3 <= 397.183 )
									ret := 0.124352
								if( ema3 > 397.183 )
									ret := 0.658120
						if( ema12 > 0.900783 )
							if( bbp <= 4.39428 )
								if( bbm <= 0.62705 )
									ret := 0.100000
								if( bbm > 0.62705 )
									ret := -0.750000 // sell
							if( bbp > 4.39428 )
								if( ema13 <= 2.37101 )
									ret := 0.692308
								if( ema13 > 2.37101 )
									ret := -1.000000 // sell
					if( ema1 > 399.853 )
						if( ema13 <= 1.99747 )
							if( ema12 <= 0.379663 )
								if( ema1 <= 402.61 )
									ret := -0.275229
								if( ema1 > 402.61 )
									ret := 0.600000
							if( ema12 > 0.379663 )
								if( ema3 <= 399.985 )
									ret := -0.162500
								if( ema3 > 399.985 )
									ret := -0.858696 // sell
						if( ema13 > 1.99747 )
							if( bbm <= 0.125 )
								ret := 0.000000
							if( bbm > 0.125 )
								if( bbp <= 3.17874 )
									ret := 0.500000
								if( bbp > 3.17874 )
									ret := 0.937500 // buy
				if( ema1 > 402.989 )
					if( bearPower <= 0.255198 )
						if( bbm <= 0.892358 )
							if( ema1 <= 403.484 )
								if( ema12 <= 0.296062 )
									ret := 0.750000 // buy
								if( ema12 > 0.296062 )
									ret := 1.000000 // buy
							if( ema1 > 403.484 )
								if( tema <= 404.929 )
									ret := 0.314286
								if( tema > 404.929 )
									ret := 0.842105 // buy
						if( bbm > 0.892358 )
							if( ema3 <= 403.919 )
								ret := 0.285714
							if( ema3 > 403.919 )
								ret := -0.750000 // sell
					if( bearPower > 0.255198 )
						if( bbm <= 0.189402 )
							if( ema1 <= 404.513 )
								if( ema12 <= 0.317451 )
									ret := 0.666667
								if( ema12 > 0.317451 )
									ret := -0.304348
							if( ema1 > 404.513 )
								if( tema <= 406.066 )
									ret := 0.876923 // buy
								if( tema > 406.066 )
									ret := -0.333333
						if( bbm > 0.189402 )
							if( bearPower <= 0.589714 )
								if( bbp <= 1.39702 )
									ret := 0.104478
								if( bbp > 1.39702 )
									ret := -0.707317 // sell
							if( bearPower > 0.589714 )
								if( ema13 <= 6.41841 )
									ret := 0.705882 // buy
								if( ema13 > 6.41841 )
									ret := -0.111111
			if( ema2 > 405.193 )
				if( tema <= 459.187 )
					if( ema3 <= 405.032 )
						if( bbm <= 0.343795 )
							if( ema2 <= 405.307 )
								if( tema <= 405.985 )
									ret := 0.000000
								if( tema > 405.985 )
									ret := 0.500000
							if( ema2 > 405.307 )
								if( bbp <= 1.4159 )
									ret := -1.000000 // sell
								if( bbp > 1.4159 )
									ret := -0.250000
						if( bbm > 0.343795 )
							ret := -1.000000 // sell
					if( ema3 > 405.032 )
						if( bbp <= 1.68104 )
							if( ema13 <= 0.920067 )
								if( ema2 <= 415.452 )
									ret := -0.022907
								if( ema2 > 415.452 )
									ret := -0.150737
							if( ema13 > 0.920067 )
								if( ema13 <= 1.39092 )
									ret := -0.362782
								if( ema13 > 1.39092 )
									ret := 0.012346
						if( bbp > 1.68104 )
							if( ema1 <= 407.263 )
								if( bullPower <= 1.93756 )
									ret := -0.951220 // sell
								if( bullPower > 1.93756 )
									ret := -0.625000
							if( ema1 > 407.263 )
								if( tema <= 409.559 )
									ret := 0.517857
								if( tema > 409.559 )
									ret := -0.029323
				if( tema > 459.187 )
					if( ema2 <= 465.011 )
						if( ema13 <= 1.00673 )
							if( bearPower <= 0.465315 )
								if( bullPower <= 0.601401 )
									ret := 0.604396
								if( bullPower > 0.601401 )
									ret := 0.166667
							if( bearPower > 0.465315 )
								if( ema3 <= 460.567 )
									ret := 0.000000
								if( ema3 > 460.567 )
									ret := -0.736842 // sell
						if( ema13 > 1.00673 )
							if( ema12 <= 0.751231 )
								if( ema1 <= 462.085 )
									ret := 0.750000 // buy
								if( ema1 > 462.085 )
									ret := 1.000000 // buy
							if( ema12 > 0.751231 )
								ret := 0.250000
					if( ema2 > 465.011 )
						if( bullPower <= 0.82703 )
							if( bearPower <= 0.190957 )
								if( ema13 <= 0.666722 )
									ret := -0.250000
								if( ema13 > 0.666722 )
									ret := -1.000000 // sell
							if( bearPower > 0.190957 )
								if( ema3 <= 465.851 )
									ret := 0.250000
								if( ema3 > 465.851 )
									ret := -0.066667
						if( bullPower > 0.82703 )
							if( tema <= 466.701 )
								ret := -0.750000 // sell
							if( tema > 466.701 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_MSFT_1Min_8411a5bf(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


