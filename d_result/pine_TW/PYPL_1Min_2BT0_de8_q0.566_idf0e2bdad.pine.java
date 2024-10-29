//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: PYPL_1Min_2BT0_f0e2bdad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2BT0_f0e2bdad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_f0e2bdad(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bearPower <= 0.058147 )
		if( BBPower_Color <= 0.5 )
			if( ema2 <= 58.2945 )
				if( bbm <= 0.003527 )
					if( ema2 <= 58.1986 )
						if( ema1 <= 58.1446 )
							if( ema3 <= 58.1186 )
								if( tema <= 57.7274 )
									ret := 0.829787 // buy
								if( tema > 57.7274 )
									ret := 0.470588
							if( ema3 > 58.1186 )
								ret := 0.066667
						if( ema1 > 58.1446 )
							if( bullPower <= -0.024425 )
								ret := 1.000000 // buy
							if( bullPower > -0.024425 )
								ret := 0.500000
					if( ema2 > 58.1986 )
						if( ema2 <= 58.2113 )
							if( ema3 <= 58.1961 )
								ret := -0.642857
							if( ema3 > 58.1961 )
								ret := -0.307692
						if( ema2 > 58.2113 )
							if( ema2 <= 58.2601 )
								ret := -0.083333
							if( ema2 > 58.2601 )
								ret := 0.040000
				if( bbm > 0.003527 )
					if( ema1 <= 57.6713 )
						if( bearPower <= -0.179854 )
							if( bullPower <= -0.128718 )
								ret := 1.000000 // buy
							if( bullPower > -0.128718 )
								ret := 0.200000
						if( bearPower > -0.179854 )
							if( ema12 <= -0.045299 )
								if( tema <= 57.2456 )
									ret := 0.300000
								if( tema > 57.2456 )
									ret := -0.731183 // sell
							if( ema12 > -0.045299 )
								if( ema13 <= 0.035977 )
									ret := 0.204545
								if( ema13 > 0.035977 )
									ret := -1.000000 // sell
					if( ema1 > 57.6713 )
						if( bullPower <= -0.142407 )
							ret := -0.928571 // sell
						if( bullPower > -0.142407 )
							if( bearPower <= -0.134875 )
								if( ema13 <= -0.142239 )
									ret := -0.466667
								if( ema13 > -0.142239 )
									ret := 0.757009 // buy
							if( bearPower > -0.134875 )
								if( ema13 <= -0.088411 )
									ret := 0.618557
								if( ema13 > -0.088411 )
									ret := 0.154428
			if( ema2 > 58.2945 )
				if( bbm <= 0.009993 )
					if( ema1 <= 61.8576 )
						if( ema1 <= 61.2234 )
							if( ema3 <= 59.6124 )
								if( ema13 <= -0.025553 )
									ret := 0.119691
								if( ema13 > -0.025553 )
									ret := 0.511811
							if( ema3 > 59.6124 )
								if( ema2 <= 59.6468 )
									ret := -0.809524 // sell
								if( ema2 > 59.6468 )
									ret := 0.171951
						if( ema1 > 61.2234 )
							if( ema12 <= 0.002629 )
								if( ema1 <= 61.4504 )
									ret := -0.761905 // sell
								if( ema1 > 61.4504 )
									ret := -0.224771
							if( ema12 > 0.002629 )
								if( ema3 <= 61.5696 )
									ret := 0.222222
								if( ema3 > 61.5696 )
									ret := 0.769231 // buy
					if( ema1 > 61.8576 )
						if( bearPower <= -0.037227 )
							if( bbp <= -0.368642 )
								if( ema12 <= -0.086142 )
									ret := 0.609524
								if( ema12 > -0.086142 )
									ret := 0.956897 // buy
							if( bbp > -0.368642 )
								if( tema <= 80.8555 )
									ret := 0.462375
								if( tema > 80.8555 )
									ret := -0.419355
						if( bearPower > -0.037227 )
							if( ema12 <= -0.012067 )
								if( ema3 <= 63.5079 )
									ret := 0.404255
								if( ema3 > 63.5079 )
									ret := -0.058568
							if( ema12 > -0.012067 )
								if( ema12 <= 0.044709 )
									ret := 0.262200
								if( ema12 > 0.044709 )
									ret := 0.789474 // buy
				if( bbm > 0.009993 )
					if( bbm <= 0.265497 )
						if( tema <= 74.1806 )
							if( ema13 <= -0.428917 )
								if( ema12 <= -0.751593 )
									ret := -1.000000 // sell
								if( ema12 > -0.751593 )
									ret := 0.500000
							if( ema13 > -0.428917 )
								if( bullPower <= -0.024715 )
									ret := 0.016396
								if( bullPower > -0.024715 )
									ret := -0.040337
						if( tema > 74.1806 )
							if( ema2 <= 77.7239 )
								if( bearPower <= -0.245558 )
									ret := 0.536145
								if( bearPower > -0.245558 )
									ret := 0.210078
							if( ema2 > 77.7239 )
								if( ema3 <= 81.7305 )
									ret := -0.002969
								if( ema3 > 81.7305 )
									ret := -0.969697 // sell
					if( bbm > 0.265497 )
						if( ema1 <= 64.9513 )
							if( bbm <= 0.898 )
								if( ema12 <= -0.005379 )
									ret := 0.511278
								if( ema12 > -0.005379 )
									ret := -0.023810
							if( bbm > 0.898 )
								ret := 1.000000 // buy
						if( ema1 > 64.9513 )
							if( tema <= 66.9131 )
								if( bearPower <= -0.214544 )
									ret := -0.523077
								if( bearPower > -0.214544 )
									ret := 0.777778 // buy
							if( tema > 66.9131 )
								if( ema13 <= 0.130734 )
									ret := 0.129032
								if( ema13 > 0.130734 )
									ret := -0.958333 // sell
		if( BBPower_Color > 0.5 )
			if( bbm <= 0.032904 )
				if( ema12 <= -0.005028 )
					if( ema12 <= -0.036371 )
						if( ema13 <= -0.10686 )
							if( ema12 <= -0.057489 )
								ret := 0.100000
							if( ema12 > -0.057489 )
								ret := 0.916667 // buy
						if( ema13 > -0.10686 )
							if( ema13 <= -0.081639 )
								ret := -0.071429
							if( ema13 > -0.081639 )
								ret := 0.454545
					if( ema12 > -0.036371 )
						if( bbm <= 0.017016 )
							if( bullPower <= 0.014486 )
								if( ema3 <= 77.4972 )
									ret := -0.126126
								if( ema3 > 77.4972 )
									ret := -0.658537
							if( bullPower > 0.014486 )
								if( ema3 <= 59.3913 )
									ret := -0.108696
								if( ema3 > 59.3913 )
									ret := -0.500000
						if( bbm > 0.017016 )
							if( bullPower <= 0.016484 )
								if( bearPower <= -0.012468 )
									ret := -0.142857
								if( bearPower > -0.012468 )
									ret := 0.166667
							if( bullPower > 0.016484 )
								if( ema2 <= 63.4465 )
									ret := -0.257310
								if( ema2 > 63.4465 )
									ret := -0.021739
				if( ema12 > -0.005028 )
					if( bearPower <= 0.017993 )
						if( ema12 <= 0.017384 )
							if( ema2 <= 58.1704 )
								if( ema2 <= 58.0784 )
									ret := -0.112069
								if( ema2 > 58.0784 )
									ret := -0.578313
							if( ema2 > 58.1704 )
								if( tema <= 78.4113 )
									ret := 0.006743
								if( tema > 78.4113 )
									ret := -0.268085
						if( ema12 > 0.017384 )
							if( ema3 <= 63.8913 )
								if( ema1 <= 63.7018 )
									ret := 0.016771
								if( ema1 > 63.7018 )
									ret := -0.412698
							if( ema3 > 63.8913 )
								if( bbp <= 0.028792 )
									ret := 0.359184
								if( bbp > 0.028792 )
									ret := 0.087671
					if( bearPower > 0.017993 )
						if( tema <= 62.2929 )
							if( ema3 <= 61.856 )
								if( bbp <= 0.112444 )
									ret := -0.135181
								if( bbp > 0.112444 )
									ret := -0.378151
							if( ema3 > 61.856 )
								if( ema13 <= 0.056058 )
									ret := -0.686047
								if( ema13 > 0.056058 )
									ret := 0.000000
						if( tema > 62.2929 )
							if( bbm <= 0.031128 )
								if( ema2 <= 63.0538 )
									ret := 0.293333
								if( ema2 > 63.0538 )
									ret := -0.047709
							if( bbm > 0.031128 )
								if( ema1 <= 64.2501 )
									ret := 0.181818
								if( ema1 > 64.2501 )
									ret := -0.548387
			if( bbm > 0.032904 )
				if( ema2 <= 57.7822 )
					if( bbm <= 0.068243 )
						if( bearPower <= 0.003388 )
							if( ema2 <= 57.6903 )
								if( ema3 <= 57.4815 )
									ret := 0.733333 // buy
								if( ema3 > 57.4815 )
									ret := 0.142857
							if( ema2 > 57.6903 )
								ret := 0.925926 // buy
						if( bearPower > 0.003388 )
							if( ema1 <= 57.2639 )
								ret := 1.000000 // buy
							if( ema1 > 57.2639 )
								if( ema2 <= 57.529 )
									ret := -0.472222
								if( ema2 > 57.529 )
									ret := 0.360000
					if( bbm > 0.068243 )
						if( bearPower <= 0.010114 )
							if( tema <= 57.6656 )
								ret := 0.550000
							if( tema > 57.6656 )
								if( ema2 <= 57.708 )
									ret := 1.000000 // buy
								if( ema2 > 57.708 )
									ret := 0.900000 // buy
						if( bearPower > 0.010114 )
							ret := 0.466667
				if( ema2 > 57.7822 )
					if( ema1 <= 58.6265 )
						if( ema3 <= 58.3057 )
							if( ema3 <= 57.8358 )
								if( bbp <= 0.128189 )
									ret := -0.739130 // sell
								if( bbp > 0.128189 )
									ret := -1.000000 // sell
							if( ema3 > 57.8358 )
								if( bullPower <= 0.083432 )
									ret := 0.160550
								if( bullPower > 0.083432 )
									ret := -0.452941
						if( ema3 > 58.3057 )
							if( ema3 <= 58.5981 )
								if( ema12 <= 0.009454 )
									ret := -0.044776
								if( ema12 > 0.009454 )
									ret := -0.722772 // sell
							if( ema3 > 58.5981 )
								ret := 0.733333 // buy
					if( ema1 > 58.6265 )
						if( ema2 <= 59.2338 )
							if( tema <= 59.2129 )
								if( bullPower <= 0.028764 )
									ret := -0.250000
								if( bullPower > 0.028764 )
									ret := 0.179617
							if( tema > 59.2129 )
								if( ema3 <= 59.1495 )
									ret := 0.929825 // buy
								if( ema3 > 59.1495 )
									ret := 0.595238
						if( ema2 > 59.2338 )
							if( bullPower <= 0.065287 )
								if( ema1 <= 64.2663 )
									ret := -0.085209
								if( ema1 > 64.2663 )
									ret := 0.021748
							if( bullPower > 0.065287 )
								if( bullPower <= 0.168806 )
									ret := 0.067051
								if( bullPower > 0.168806 )
									ret := -0.099002
	if( bearPower > 0.058147 )
		if( bbm <= 0.094407 )
			if( bbm <= 0.018441 )
				if( ema12 <= 0.042101 )
					if( ema2 <= 64.1551 )
						if( tema <= 57.3906 )
							ret := 0.090909
						if( tema > 57.3906 )
							if( bbm <= 0.013145 )
								if( ema13 <= 0.069149 )
									ret := -0.634831
								if( ema13 > 0.069149 )
									ret := -0.085106
							if( bbm > 0.013145 )
								if( ema12 <= 0.038961 )
									ret := -0.750000 // sell
								if( ema12 > 0.038961 )
									ret := -1.000000 // sell
					if( ema2 > 64.1551 )
						if( ema3 <= 64.4611 )
							if( ema3 <= 64.254 )
								ret := -0.210526
							if( ema3 > 64.254 )
								if( bearPower <= 0.06254 )
									ret := -0.230769
								if( bearPower > 0.06254 )
									ret := 0.725000 // buy
						if( ema3 > 64.4611 )
							if( ema1 <= 65.9199 )
								if( ema12 <= 0.029785 )
									ret := -0.849315 // sell
								if( ema12 > 0.029785 )
									ret := -0.142857
							if( ema1 > 65.9199 )
								if( bullPower <= 0.072934 )
									ret := -0.042453
								if( bullPower > 0.072934 )
									ret := -0.379747
				if( ema12 > 0.042101 )
					if( ema1 <= 61.0485 )
						if( ema1 <= 60.6805 )
							if( ema13 <= 0.069272 )
								if( ema12 <= 0.045993 )
									ret := 0.454545
								if( ema12 > 0.045993 )
									ret := -0.333333
							if( ema13 > 0.069272 )
								if( bullPower <= 0.099823 )
									ret := -0.333333
								if( bullPower > 0.099823 )
									ret := -0.631250
						if( ema1 > 60.6805 )
							if( ema12 <= 0.11914 )
								if( ema1 <= 60.8263 )
									ret := -1.000000 // sell
								if( ema1 > 60.8263 )
									ret := -0.676471
							if( ema12 > 0.11914 )
								ret := -1.000000 // sell
					if( ema1 > 61.0485 )
						if( bbm <= 0.000587 )
							if( ema13 <= 0.080424 )
								if( ema2 <= 62.4698 )
									ret := 0.885714 // buy
								if( ema2 > 62.4698 )
									ret := -0.057292
							if( ema13 > 0.080424 )
								if( tema <= 62.4602 )
									ret := 0.569444
								if( tema > 62.4602 )
									ret := -0.228782
						if( bbm > 0.000587 )
							if( ema1 <= 70.5631 )
								if( bullPower <= 0.147931 )
									ret := -0.377432
								if( bullPower > 0.147931 )
									ret := -0.652439
							if( ema1 > 70.5631 )
								if( ema2 <= 73.6215 )
									ret := 0.285714
								if( ema2 > 73.6215 )
									ret := -0.361111
			if( bbm > 0.018441 )
				if( bearPower <= 0.116112 )
					if( bbm <= 0.060054 )
						if( ema1 <= 66.4319 )
							if( ema3 <= 58.949 )
								if( ema2 <= 58.2637 )
									ret := -0.308824
								if( ema2 > 58.2637 )
									ret := 0.401274
							if( ema3 > 58.949 )
								if( bullPower <= 0.106987 )
									ret := -0.102102
								if( bullPower > 0.106987 )
									ret := -0.354415
						if( ema1 > 66.4319 )
							if( bearPower <= 0.087369 )
								if( bullPower <= 0.129074 )
									ret := -0.100800
								if( bullPower > 0.129074 )
									ret := 0.173913
							if( bearPower > 0.087369 )
								if( ema3 <= 71.5608 )
									ret := 0.415663
								if( ema3 > 71.5608 )
									ret := 0.132275
					if( bbm > 0.060054 )
						if( ema1 <= 79.1837 )
							if( ema3 <= 72.5449 )
								if( tema <= 72.5554 )
									ret := -0.201369
								if( tema > 72.5554 )
									ret := 0.666667
							if( ema3 > 72.5449 )
								if( ema3 <= 76.2981 )
									ret := -0.759036 // sell
								if( ema3 > 76.2981 )
									ret := -0.307692
						if( ema1 > 79.1837 )
							if( ema1 <= 80.0181 )
								if( bbm <= 0.0775 )
									ret := 1.000000 // buy
								if( bbm > 0.0775 )
									ret := -0.555556
							if( ema1 > 80.0181 )
								if( ema12 <= 0.05162 )
									ret := 0.363636
								if( ema12 > 0.05162 )
									ret := -0.288462
				if( bearPower > 0.116112 )
					if( bearPower <= 0.190379 )
						if( ema13 <= 0.322177 )
							if( ema3 <= 79.4587 )
								if( ema1 <= 73.2345 )
									ret := -0.393041
								if( ema1 > 73.2345 )
									ret := -0.674603
							if( ema3 > 79.4587 )
								if( ema13 <= 0.137128 )
									ret := 0.562500
								if( ema13 > 0.137128 )
									ret := -0.375000
						if( ema13 > 0.322177 )
							ret := 0.375000
					if( bearPower > 0.190379 )
						if( ema2 <= 76.5526 )
							if( tema <= 60.6198 )
								ret := -0.857143 // sell
							if( tema > 60.6198 )
								if( tema <= 66.4646 )
									ret := -0.006579
								if( tema > 66.4646 )
									ret := -0.346535
						if( ema2 > 76.5526 )
							if( ema1 <= 78.0535 )
								if( ema2 <= 76.7437 )
									ret := 1.000000 // buy
								if( ema2 > 76.7437 )
									ret := 0.687500
							if( ema1 > 78.0535 )
								ret := 0.083333
		if( bbm > 0.094407 )
			if( ema12 <= 0.04404 )
				if( bullPower <= 0.170585 )
					ret := 0.222222
				if( bullPower > 0.170585 )
					if( ema13 <= -0.036992 )
						ret := 1.000000 // buy
					if( ema13 > -0.036992 )
						if( ema3 <= 70.795 )
							if( ema3 <= 63.7007 )
								ret := 0.062500
							if( ema3 > 63.7007 )
								if( bullPower <= 0.18643 )
									ret := 0.857143 // buy
								if( bullPower > 0.18643 )
									ret := 1.000000 // buy
						if( ema3 > 70.795 )
							ret := -0.214286
			if( ema12 > 0.04404 )
				if( tema <= 72.3859 )
					if( tema <= 58.4864 )
						if( bearPower <= 0.177343 )
							if( ema13 <= 0.102763 )
								ret := 1.000000 // buy
							if( ema13 > 0.102763 )
								ret := 0.555556
						if( bearPower > 0.177343 )
							ret := 1.000000 // buy
					if( tema > 58.4864 )
						if( tema <= 65.619 )
							if( ema12 <= 0.644741 )
								if( ema2 <= 63.7553 )
									ret := 0.007778
								if( ema2 > 63.7553 )
									ret := -0.261981
							if( ema12 > 0.644741 )
								ret := 1.000000 // buy
						if( tema > 65.619 )
							if( ema1 <= 65.9824 )
								if( ema12 <= 0.238393 )
									ret := 0.960396 // buy
								if( ema12 > 0.238393 )
									ret := 0.727273 // buy
							if( ema1 > 65.9824 )
								if( tema <= 72.1411 )
									ret := 0.072316
								if( tema > 72.1411 )
									ret := 0.645570
				if( tema > 72.3859 )
					if( ema13 <= 0.353089 )
						if( ema2 <= 78.9095 )
							if( bullPower <= 0.6106 )
								if( bbp <= 0.499122 )
									ret := -0.365314
								if( bbp > 0.499122 )
									ret := 0.016393
							if( bullPower > 0.6106 )
								ret := -1.000000 // sell
						if( ema2 > 78.9095 )
							if( bullPower <= 0.290669 )
								if( ema13 <= 0.183546 )
									ret := 0.400000
								if( ema13 > 0.183546 )
									ret := -0.029412
							if( bullPower > 0.290669 )
								if( bearPower <= 0.202821 )
									ret := -0.857143 // sell
								if( bearPower > 0.202821 )
									ret := -0.500000
					if( ema13 > 0.353089 )
						if( bearPower <= 0.123005 )
							ret := -0.428571
						if( bearPower > 0.123005 )
							if( ema1 <= 78.067 )
								ret := -1.000000 // sell
							if( ema1 > 78.067 )
								if( bullPower <= 0.353433 )
									ret := -0.769231 // sell
								if( bullPower > 0.353433 )
									ret := -0.923077 // sell
	
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
float op_operation = decision_tree_0_PYPL_1Min_f0e2bdad(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


