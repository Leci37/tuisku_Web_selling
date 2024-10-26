//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: DOGEUSDT_30Min_1WIL_9de96579 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_1WIL_9de96579", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_9de96579(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( wvf <= 4.30112 )
		if( upperBand <= 5.6707 )
			if( Color_con2 <= -5.0018 )
				if( Color_con2 <= -7.36412 )
					if( lowerBand <= 1.42189 )
						if( Color_con2 <= -8.2473 )
							if( midLine <= 1.08038 )
								if( lowerBand <= 0.203098 )
									ret := -0.025000
								if( lowerBand > 0.203098 )
									ret := -0.720000 // sell
							if( midLine > 1.08038 )
								if( midLine <= 1.45113 )
									ret := 0.690141
								if( midLine > 1.45113 )
									ret := 0.011013
						if( Color_con2 > -8.2473 )
							if( midLine <= 2.20188 )
								if( wvf <= 2.72899 )
									ret := -0.118421
								if( wvf > 2.72899 )
									ret := -0.692308
							if( midLine > 2.20188 )
								if( lowerBand <= -0.236432 )
									ret := -0.962963 // sell
								if( lowerBand > -0.236432 )
									ret := -0.616279
					if( lowerBand > 1.42189 )
						if( Color_con2 <= -7.88391 )
							ret := 0.444444
						if( Color_con2 > -7.88391 )
							ret := 1.000000 // buy
				if( Color_con2 > -7.36412 )
					if( lowerBand <= 1.37161 )
						if( midLine <= 3.01577 )
							if( upperBand <= 5.59677 )
								if( upperBand <= 5.23779 )
									ret := 0.231310
								if( upperBand > 5.23779 )
									ret := -0.196078
							if( upperBand > 5.59677 )
								if( Color_con2 <= -5.46848 )
									ret := 0.444444
								if( Color_con2 > -5.46848 )
									ret := 1.000000 // buy
						if( midLine > 3.01577 )
							if( wvf <= 2.24346 )
								if( Color_con1 <= -3.92295 )
									ret := -0.875000 // sell
								if( Color_con1 > -3.92295 )
									ret := -0.666667
							if( wvf > 2.24346 )
								ret := -0.055556
					if( lowerBand > 1.37161 )
						if( lowerBand <= 1.97558 )
							if( sDev <= 1.87124 )
								if( wvf <= 2.32292 )
									ret := 0.166667
								if( wvf > 2.32292 )
									ret := 0.666667
							if( sDev > 1.87124 )
								ret := 0.904762 // buy
						if( lowerBand > 1.97558 )
							if( lowerBand <= 2.11115 )
								ret := 0.866667 // buy
							if( lowerBand > 2.11115 )
								ret := 1.000000 // buy
			if( Color_con2 > -5.0018 )
				if( Color_con2 <= 2.04883 )
					if( sDev <= 1.05533 )
						if( sDev <= 1.04832 )
							if( lowerBand <= 0.680572 )
								if( Color_con2 <= 0.316292 )
									ret := 0.013345
								if( Color_con2 > 0.316292 )
									ret := -0.089969
							if( lowerBand > 0.680572 )
								if( lowerBand <= 0.850425 )
									ret := -0.150104
								if( lowerBand > 0.850425 )
									ret := -0.014876
						if( sDev > 1.04832 )
							if( upperBand <= 2.6644 )
								if( midLine <= 1.25058 )
									ret := 0.175258
								if( midLine > 1.25058 )
									ret := 0.575342
							if( upperBand > 2.6644 )
								if( wvf <= 1.77822 )
									ret := -0.565217
								if( wvf > 1.77822 )
									ret := 0.175000
					if( sDev > 1.05533 )
						if( upperBand <= 4.27619 )
							if( upperBand <= 4.04562 )
								if( upperBand <= 2.58359 )
									ret := -0.093040
								if( upperBand > 2.58359 )
									ret := -0.023383
							if( upperBand > 4.04562 )
								if( colInt <= 0.5 )
									ret := -0.165678
								if( colInt > 0.5 )
									ret := -0.143403
						if( upperBand > 4.27619 )
							if( Color_con2 <= -4.71458 )
								if( sDev <= 1.69684 )
									ret := 0.529412
								if( sDev > 1.69684 )
									ret := -0.347826
							if( Color_con2 > -4.71458 )
								if( lowerBand <= 1.42381 )
									ret := 0.034574
								if( lowerBand > 1.42381 )
									ret := -0.099537
				if( Color_con2 > 2.04883 )
					if( wvf <= 3.88946 )
						if( lowerBand <= -0.684666 )
							if( Color_con1 <= 0.208052 )
								if( sDev <= 3.0594 )
									ret := 0.942857 // buy
								if( sDev > 3.0594 )
									ret := 0.666667
							if( Color_con1 > 0.208052 )
								ret := 0.461538
						if( lowerBand > -0.684666 )
							if( Color_con1 <= 0.844063 )
								if( Color_con1 <= 0.479669 )
									ret := -0.090909
								if( Color_con1 > 0.479669 )
									ret := 0.793103 // buy
							if( Color_con1 > 0.844063 )
								ret := -0.250000
					if( wvf > 3.88946 )
						if( lowerBand <= -0.363037 )
							if( Color_con1 <= 0.428592 )
								if( lowerBand <= -1.01118 )
									ret := -0.700000 // sell
								if( lowerBand > -1.01118 )
									ret := 0.350000
							if( Color_con1 > 0.428592 )
								if( Color_con2 <= 2.27828 )
									ret := -0.933333 // sell
								if( Color_con2 > 2.27828 )
									ret := -0.318182
						if( lowerBand > -0.363037 )
							if( midLine <= 1.67579 )
								ret := 1.000000 // buy
							if( midLine > 1.67579 )
								ret := 0.533333
		if( upperBand > 5.6707 )
			if( wvf <= 2.9252 )
				if( wvf <= 1.172 )
					if( upperBand <= 18.0426 )
						if( lowerBand <= -3.07693 )
							if( upperBand <= 13.4411 )
								if( wvf <= 0.927633 )
									ret := -0.522727
								if( wvf > 0.927633 )
									ret := -1.000000 // sell
							if( upperBand > 13.4411 )
								ret := -0.153846
						if( lowerBand > -3.07693 )
							if( Color_con1 <= -7.76386 )
								if( midLine <= 5.43182 )
									ret := 0.244648
								if( midLine > 5.43182 )
									ret := -0.239437
							if( Color_con1 > -7.76386 )
								if( sDev <= 4.43108 )
									ret := -0.088079
								if( sDev > 4.43108 )
									ret := -0.401235
					if( upperBand > 18.0426 )
						if( Color_con2 <= -12.6045 )
							ret := 0.416667
						if( Color_con2 > -12.6045 )
							ret := 1.000000 // buy
				if( wvf > 1.172 )
					if( midLine <= 12.2305 )
						if( Color_con1 <= -17.466 )
							if( Color_con2 <= -16.6913 )
								ret := 0.428571
							if( Color_con2 > -16.6913 )
								if( lowerBand <= -4.20154 )
									ret := -0.187500
								if( lowerBand > -4.20154 )
									ret := -0.901099 // sell
						if( Color_con1 > -17.466 )
							if( Color_con1 <= -15.5501 )
								if( midLine <= 9.90173 )
									ret := 0.490196
								if( midLine > 9.90173 )
									ret := -0.625000
							if( Color_con1 > -15.5501 )
								if( midLine <= 5.44258 )
									ret := -0.165999
								if( midLine > 5.44258 )
									ret := -0.319897
					if( midLine > 12.2305 )
						if( Color_con1 <= -29.5486 )
							if( sDev <= 16.1791 )
								ret := -1.000000 // sell
							if( sDev > 16.1791 )
								ret := 0.000000
						if( Color_con1 > -29.5486 )
							if( midLine <= 13.9976 )
								if( wvf <= 2.37849 )
									ret := 1.000000 // buy
								if( wvf > 2.37849 )
									ret := 0.692308
							if( midLine > 13.9976 )
								ret := 0.529412
			if( wvf > 2.9252 )
				if( midLine <= 3.71219 )
					if( lowerBand <= 0.145725 )
						if( Color_con2 <= -0.745286 )
							if( Color_con1 <= -1.91996 )
								if( midLine <= 3.54698 )
									ret := 0.236196
								if( midLine > 3.54698 )
									ret := -0.301587
							if( Color_con1 > -1.91996 )
								ret := 0.850000 // buy
						if( Color_con2 > -0.745286 )
							if( Color_con1 <= -1.81799 )
								if( Color_con1 <= -2.13271 )
									ret := -0.267281
								if( Color_con1 > -2.13271 )
									ret := -0.611111
							if( Color_con1 > -1.81799 )
								if( sDev <= 3.0311 )
									ret := 0.357143
								if( sDev > 3.0311 )
									ret := 0.000000
					if( lowerBand > 0.145725 )
						if( upperBand <= 6.70571 )
							if( midLine <= 3.31707 )
								if( lowerBand <= 0.419923 )
									ret := -0.254098
								if( lowerBand > 0.419923 )
									ret := 0.072072
							if( midLine > 3.31707 )
								if( Color_con1 <= -2.21526 )
									ret := -0.356195
								if( Color_con1 > -2.21526 )
									ret := -0.643836
						if( upperBand > 6.70571 )
							if( Color_con1 <= -3.60816 )
								ret := -0.454545
							if( Color_con1 > -3.60816 )
								if( Color_con2 <= -0.92141 )
									ret := -1.000000 // sell
								if( Color_con2 > -0.92141 )
									ret := -0.866667 // sell
				if( midLine > 3.71219 )
					if( sDev <= 13.1228 )
						if( upperBand <= 7.922 )
							if( sDev <= 3.04071 )
								if( Color_con2 <= -5.48352 )
									ret := 0.486486
								if( Color_con2 > -5.48352 )
									ret := -0.029758
							if( sDev > 3.04071 )
								if( wvf <= 3.60777 )
									ret := 0.495536
								if( wvf > 3.60777 )
									ret := 0.296296
						if( upperBand > 7.922 )
							if( Color_con1 <= -20.6825 )
								if( wvf <= 3.83979 )
									ret := 1.000000 // buy
								if( wvf > 3.83979 )
									ret := 0.312500
							if( Color_con1 > -20.6825 )
								if( Color_con1 <= -15.1551 )
									ret := -0.642857
								if( Color_con1 > -15.1551 )
									ret := -0.084723
					if( sDev > 13.1228 )
						if( upperBand <= 27.6044 )
							if( lowerBand <= -3.3697 )
								ret := -0.562500
							if( lowerBand > -3.3697 )
								if( lowerBand <= -1.72549 )
									ret := -1.000000 // sell
								if( lowerBand > -1.72549 )
									ret := -0.909091 // sell
						if( upperBand > 27.6044 )
							if( lowerBand <= 0.749291 )
								ret := 0.454545
							if( lowerBand > 0.749291 )
								ret := -0.818182 // sell
	if( wvf > 4.30112 )
		if( wvf <= 7.46996 )
			if( lowerBand <= 5.40236 )
				if( midLine <= 16.7366 )
					if( lowerBand <= 2.39039 )
						if( Color_con2 <= 2.47239 )
							if( sDev <= 1.92451 )
								if( upperBand <= 5.55468 )
									ret := -0.161885
								if( upperBand > 5.55468 )
									ret := -0.676923
							if( sDev > 1.92451 )
								if( midLine <= 10.8582 )
									ret := 0.073428
								if( midLine > 10.8582 )
									ret := -0.226950
						if( Color_con2 > 2.47239 )
							if( Color_con1 <= 1.41313 )
								if( lowerBand <= 0.603842 )
									ret := 0.328000
								if( lowerBand > 0.603842 )
									ret := 0.701613 // buy
							if( Color_con1 > 1.41313 )
								if( sDev <= 2.90027 )
									ret := -0.156863
								if( sDev > 2.90027 )
									ret := 0.500000
					if( lowerBand > 2.39039 )
						if( upperBand <= 7.35048 )
							if( Color_con2 <= 0.651241 )
								if( sDev <= 2.0683 )
									ret := 0.347328
								if( sDev > 2.0683 )
									ret := 0.794393 // buy
							if( Color_con2 > 0.651241 )
								if( Color_con1 <= -0.545248 )
									ret := -1.000000 // sell
								if( Color_con1 > -0.545248 )
									ret := 0.428571
						if( upperBand > 7.35048 )
							if( wvf <= 6.95953 )
								if( midLine <= 5.51623 )
									ret := -0.145923
								if( midLine > 5.51623 )
									ret := 0.230922
							if( wvf > 6.95953 )
								if( sDev <= 2.51485 )
									ret := 0.333333
								if( sDev > 2.51485 )
									ret := -0.348485
				if( midLine > 16.7366 )
					if( lowerBand <= 1.16565 )
						ret := -0.333333
					if( lowerBand > 1.16565 )
						ret := -1.000000 // sell
			if( lowerBand > 5.40236 )
				if( upperBand <= 13.3322 )
					if( upperBand <= 12.5307 )
						if( wvf <= 6.41369 )
							ret := -0.437500
						if( wvf > 6.41369 )
							ret := 0.285714
					if( upperBand > 12.5307 )
						ret := 0.500000
				if( upperBand > 13.3322 )
					if( lowerBand <= 6.23374 )
						if( midLine <= 11.3426 )
							if( upperBand <= 13.9998 )
								ret := -1.000000 // sell
							if( upperBand > 13.9998 )
								ret := -0.600000
						if( midLine > 11.3426 )
							if( wvf <= 5.48908 )
								ret := 0.733333 // buy
							if( wvf > 5.48908 )
								if( wvf <= 6.13925 )
									ret := -0.909091 // sell
								if( wvf > 6.13925 )
									ret := 0.047619
					if( lowerBand > 6.23374 )
						if( Color_con2 <= -8.88117 )
							if( upperBand <= 27.6969 )
								ret := 0.000000
							if( upperBand > 27.6969 )
								if( upperBand <= 32.489 )
									ret := -0.800000 // sell
								if( upperBand > 32.489 )
									ret := -1.000000 // sell
						if( Color_con2 > -8.88117 )
							if( lowerBand <= 6.84098 )
								ret := -1.000000 // sell
							if( lowerBand > 6.84098 )
								ret := -0.882353 // sell
		if( wvf > 7.46996 )
			if( sDev <= 8.11979 )
				if( sDev <= 3.75242 )
					if( upperBand <= 12.791 )
						if( Color_con2 <= -0.662541 )
							if( Color_con2 <= -2.7911 )
								ret := 0.363636
							if( Color_con2 > -2.7911 )
								if( upperBand <= 11.8349 )
									ret := 0.906250 // buy
								if( upperBand > 11.8349 )
									ret := 0.978261 // buy
						if( Color_con2 > -0.662541 )
							if( Color_con1 <= -0.556867 )
								if( upperBand <= 9.62606 )
									ret := -0.210526
								if( upperBand > 9.62606 )
									ret := 0.268571
							if( Color_con1 > -0.556867 )
								if( Color_con2 <= 0.898589 )
									ret := 0.100000
								if( Color_con2 > 0.898589 )
									ret := 0.580556
					if( upperBand > 12.791 )
						if( upperBand <= 15.247 )
							if( upperBand <= 13.5624 )
								if( sDev <= 3.33119 )
									ret := -0.541667
								if( sDev > 3.33119 )
									ret := 0.285714
							if( upperBand > 13.5624 )
								if( Color_con1 <= -4.70794 )
									ret := -1.000000 // sell
								if( Color_con1 > -4.70794 )
									ret := -0.727273 // sell
						if( upperBand > 15.247 )
							if( wvf <= 11.2621 )
								ret := 0.272727
							if( wvf > 11.2621 )
								ret := 1.000000 // buy
				if( sDev > 3.75242 )
					if( wvf <= 12.9946 )
						if( midLine <= 7.63041 )
							if( upperBand <= 9.94678 )
								if( wvf <= 9.44371 )
									ret := 0.022339
								if( wvf > 9.44371 )
									ret := 0.280702
							if( upperBand > 9.94678 )
								if( lowerBand <= -2.21501 )
									ret := 0.668675
								if( lowerBand > -2.21501 )
									ret := 0.238649
						if( midLine > 7.63041 )
							if( sDev <= 7.46118 )
								if( midLine <= 9.32316 )
									ret := -0.083658
								if( midLine > 9.32316 )
									ret := 0.239354
							if( sDev > 7.46118 )
								if( Color_con1 <= -5.67995 )
									ret := -0.086420
								if( Color_con1 > -5.67995 )
									ret := -0.712121 // sell
					if( wvf > 12.9946 )
						if( sDev <= 4.52173 )
							if( upperBand <= 17.7093 )
								if( colInt <= 0.5 )
									ret := 1.000000 // buy
								if( colInt > 0.5 )
									ret := 0.954545 // buy
							if( upperBand > 17.7093 )
								ret := 0.800000 // buy
						if( sDev > 4.52173 )
							if( Color_con2 <= 7.29466 )
								if( Color_con2 <= 4.83739 )
									ret := 0.440945
								if( Color_con2 > 4.83739 )
									ret := -0.112903
							if( Color_con2 > 7.29466 )
								if( upperBand <= 9.7203 )
									ret := 0.481481
								if( upperBand > 9.7203 )
									ret := 0.914530 // buy
			if( sDev > 8.11979 )
				if( midLine <= 14.6064 )
					if( Color_con2 <= 4.93191 )
						if( Color_con1 <= -4.3866 )
							if( midLine <= 12.0122 )
								if( upperBand <= 27.1183 )
									ret := -0.507064
								if( upperBand > 27.1183 )
									ret := 0.700000 // buy
							if( midLine > 12.0122 )
								if( midLine <= 13.5595 )
									ret := 0.145594
								if( midLine > 13.5595 )
									ret := -0.532468
						if( Color_con1 > -4.3866 )
							if( Color_con1 <= -3.01328 )
								if( sDev <= 9.46767 )
									ret := 0.518072
								if( sDev > 9.46767 )
									ret := -0.163636
							if( Color_con1 > -3.01328 )
								if( wvf <= 19.2542 )
									ret := -0.650000
								if( wvf > 19.2542 )
									ret := 0.222222
					if( Color_con2 > 4.93191 )
						if( Color_con2 <= 9.60444 )
							if( lowerBand <= 1.51452 )
								if( Color_con1 <= -2.67399 )
									ret := 0.587097
								if( Color_con1 > -2.67399 )
									ret := 0.301370
							if( lowerBand > 1.51452 )
								if( Color_con2 <= 6.91076 )
									ret := -0.916667 // sell
								if( Color_con2 > 6.91076 )
									ret := -0.058824
						if( Color_con2 > 9.60444 )
							if( Color_con2 <= 10.1922 )
								ret := 1.000000 // buy
							if( Color_con2 > 10.1922 )
								if( wvf <= 20.6012 )
									ret := -0.166667
								if( wvf > 20.6012 )
									ret := 0.826446 // buy
				if( midLine > 14.6064 )
					if( Color_con1 <= -31.4301 )
						ret := -1.000000 // sell
					if( Color_con1 > -31.4301 )
						if( upperBand <= 30.6115 )
							if( Color_con1 <= -19.5679 )
								ret := -1.000000 // sell
							if( Color_con1 > -19.5679 )
								if( midLine <= 15.2321 )
									ret := 0.250000
								if( midLine > 15.2321 )
									ret := 0.704626 // buy
						if( upperBand > 30.6115 )
							if( Color_con1 <= -4.88641 )
								if( midLine <= 17.5103 )
									ret := -0.726562 // sell
								if( midLine > 17.5103 )
									ret := 0.080645
							if( Color_con1 > -4.88641 )
								if( lowerBand <= 10.4925 )
									ret := 0.418182
								if( lowerBand > 10.4925 )
									ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_DOGEUSDT_30Min_9de96579(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


