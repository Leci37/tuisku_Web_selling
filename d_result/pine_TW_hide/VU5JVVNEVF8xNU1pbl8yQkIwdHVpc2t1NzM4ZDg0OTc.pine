//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: UNIUSDT_15Min_2BB0_738d8497 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_2BB0_738d8497", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_738d8497(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Lower_Band <= 6.03638 )
		if( bearPower <= -0.073259 )
			if( Lower_Band <= 5.95364 )
				if( Upper_Band <= 5.45207 )
					if( bearPower <= -0.173791 )
						if( Lower_Band <= 4.62451 )
							if( bullPower <= -0.080331 )
								if( Upper_Band <= 5.06234 )
									ret := 0.000000
								if( Upper_Band > 5.06234 )
									ret := -1.000000 // sell
							if( bullPower > -0.080331 )
								if( bullPower <= -0.063578 )
									ret := 1.000000 // buy
								if( bullPower > -0.063578 )
									ret := -0.360000
						if( Lower_Band > 4.62451 )
							if( bbp <= -0.22057 )
								if( bullPower <= -0.097829 )
									ret := 0.106383
								if( bullPower > -0.097829 )
									ret := 0.844444 // buy
							if( bbp > -0.22057 )
								ret := -0.750000 // sell
					if( bearPower > -0.173791 )
						if( bbm <= 0.058825 )
							if( Upper_Band <= 3.98316 )
								if( bullPower <= -0.031128 )
									ret := 0.214286
								if( bullPower > -0.031128 )
									ret := -0.640000
							if( Upper_Band > 3.98316 )
								if( Lower_Band <= 4.13563 )
									ret := 0.855932 // buy
								if( Lower_Band > 4.13563 )
									ret := 0.411538
						if( bbm > 0.058825 )
							if( bbp <= -0.055209 )
								if( bbm <= 0.1495 )
									ret := 0.191116
								if( bbm > 0.1495 )
									ret := 0.566667
							if( bbp > -0.055209 )
								if( bullPower <= 0.033505 )
									ret := 0.071429
								if( bullPower > 0.033505 )
									ret := 0.918919 // buy
				if( Upper_Band > 5.45207 )
					if( bbm <= 0.317712 )
						if( Upper_Band <= 6.71106 )
							if( Lower_Band <= 4.87404 )
								if( bbm <= 0.114853 )
									ret := 1.000000 // buy
								if( bbm > 0.114853 )
									ret := 0.310345
							if( Lower_Band > 4.87404 )
								if( basis <= 6.07049 )
									ret := 0.041385
								if( basis > 6.07049 )
									ret := -0.232955
						if( Upper_Band > 6.71106 )
							if( basis <= 6.41021 )
								if( basis <= 6.35375 )
									ret := 0.888889 // buy
								if( basis > 6.35375 )
									ret := 1.000000 // buy
							if( basis > 6.41021 )
								ret := 0.750000 // buy
					if( bbm > 0.317712 )
						if( Upper_Band <= 5.87712 )
							ret := 1.000000 // buy
						if( Upper_Band > 5.87712 )
							ret := 0.809524 // buy
			if( Lower_Band > 5.95364 )
				if( Lower_Band <= 5.99025 )
					if( Lower_Band <= 5.97411 )
						if( basis <= 6.10829 )
							if( bbm <= 0.073 )
								if( basis <= 6.07745 )
									ret := 0.533333
								if( basis > 6.07745 )
									ret := 0.973684 // buy
							if( bbm > 0.073 )
								ret := 1.000000 // buy
						if( basis > 6.10829 )
							if( bearPower <= -0.135286 )
								ret := 0.526316
							if( bearPower > -0.135286 )
								if( basis <= 6.17426 )
									ret := 0.562500
								if( basis > 6.17426 )
									ret := 1.000000 // buy
					if( Lower_Band > 5.97411 )
						if( Upper_Band <= 6.22766 )
							if( Upper_Band <= 6.16276 )
								ret := 0.363636
							if( Upper_Band > 6.16276 )
								if( bullPower <= -0.020215 )
									ret := 1.000000 // buy
								if( bullPower > -0.020215 )
									ret := 0.714286 // buy
						if( Upper_Band > 6.22766 )
							if( bearPower <= -0.124292 )
								ret := 0.076923
							if( bearPower > -0.124292 )
								ret := 0.444444
				if( Lower_Band > 5.99025 )
					if( bearPower <= -0.099158 )
						if( Lower_Band <= 6.00525 )
							if( Lower_Band <= 5.99518 )
								if( bearPower <= -0.110925 )
									ret := 0.285714
								if( bearPower > -0.110925 )
									ret := 0.750000 // buy
							if( Lower_Band > 5.99518 )
								if( Upper_Band <= 6.31958 )
									ret := -0.454545
								if( Upper_Band > 6.31958 )
									ret := 0.105263
						if( Lower_Band > 6.00525 )
							if( bullPower <= -0.051687 )
								if( Upper_Band <= 6.33271 )
									ret := -0.363636
								if( Upper_Band > 6.33271 )
									ret := 0.291667
							if( bullPower > -0.051687 )
								if( basis <= 6.14328 )
									ret := 0.633333
								if( basis > 6.14328 )
									ret := 0.939394 // buy
					if( bearPower > -0.099158 )
						if( Upper_Band <= 6.2907 )
							if( Upper_Band <= 6.15409 )
								ret := 0.357143
							if( Upper_Band > 6.15409 )
								if( Lower_Band <= 6.03321 )
									ret := -0.351064
								if( Lower_Band > 6.03321 )
									ret := -1.000000 // sell
						if( Upper_Band > 6.2907 )
							if( bearPower <= -0.085654 )
								ret := 0.900000 // buy
							if( bearPower > -0.085654 )
								ret := 0.611111
		if( bearPower > -0.073259 )
			if( bullPower <= 0.10367 )
				if( Upper_Band <= 3.68856 )
					if( basis <= 3.58762 )
						ret := 1.000000 // buy
					if( basis > 3.58762 )
						if( bearPower <= -0.054619 )
							ret := 1.000000 // buy
						if( bearPower > -0.054619 )
							ret := 0.666667
				if( Upper_Band > 3.68856 )
					if( basis <= 6.02478 )
						if( basis <= 3.56346 )
							if( Upper_Band <= 3.7503 )
								if( Upper_Band <= 3.70133 )
									ret := 0.875000 // buy
								if( Upper_Band > 3.70133 )
									ret := 1.000000 // buy
							if( Upper_Band > 3.7503 )
								ret := 0.800000 // buy
						if( basis > 3.56346 )
							if( Lower_Band <= 3.74595 )
								if( bearPower <= 0.012274 )
									ret := -0.415789
								if( bearPower > 0.012274 )
									ret := -0.819672 // sell
							if( Lower_Band > 3.74595 )
								if( bbp <= 0.085512 )
									ret := 0.013159
								if( bbp > 0.085512 )
									ret := 0.127534
					if( basis > 6.02478 )
						if( bearPower <= -0.05172 )
							if( basis <= 6.04008 )
								if( bearPower <= -0.052915 )
									ret := 0.666667
								if( bearPower > -0.052915 )
									ret := 1.000000 // buy
							if( basis > 6.04008 )
								if( basis <= 6.05172 )
									ret := -0.342857
								if( basis > 6.05172 )
									ret := 0.371429
						if( bearPower > -0.05172 )
							if( bbm <= 0.066923 )
								if( bbm <= 0.019024 )
									ret := -0.015066
								if( bbm > 0.019024 )
									ret := 0.186948
							if( bbm > 0.066923 )
								if( Upper_Band <= 6.12286 )
									ret := 0.818182 // buy
								if( Upper_Band > 6.12286 )
									ret := -0.292373
			if( bullPower > 0.10367 )
				if( bbp <= 0.20001 )
					if( Upper_Band <= 6.16567 )
						if( bearPower <= 0.007824 )
							if( basis <= 4.64056 )
								if( Lower_Band <= 4.17856 )
									ret := 0.576923
								if( Lower_Band > 4.17856 )
									ret := 1.000000 // buy
							if( basis > 4.64056 )
								if( bbp <= 0.101246 )
									ret := -0.411765
								if( bbp > 0.101246 )
									ret := 0.141026
						if( bearPower > 0.007824 )
							if( Lower_Band <= 5.25805 )
								if( bearPower <= 0.025201 )
									ret := -0.620000
								if( bearPower > 0.025201 )
									ret := -0.301471
							if( Lower_Band > 5.25805 )
								if( Upper_Band <= 6.08368 )
									ret := -0.131098
								if( Upper_Band > 6.08368 )
									ret := 0.433962
					if( Upper_Band > 6.16567 )
						if( Upper_Band <= 6.35445 )
							if( bearPower <= 0.039203 )
								if( basis <= 6.05856 )
									ret := -0.800000 // sell
								if( basis > 6.05856 )
									ret := -0.295455
							if( bearPower > 0.039203 )
								if( bbp <= 0.183021 )
									ret := -0.890625 // sell
								if( bbp > 0.183021 )
									ret := -0.400000
						if( Upper_Band > 6.35445 )
							if( bbp <= 0.181777 )
								if( bullPower <= 0.125376 )
									ret := 0.166667
								if( bullPower > 0.125376 )
									ret := -0.571429
							if( bbp > 0.181777 )
								ret := 0.583333
				if( bbp > 0.20001 )
					if( basis <= 4.87939 )
						if( basis <= 4.6895 )
							if( basis <= 4.16183 )
								if( bbp <= 0.211591 )
									ret := -0.500000
								if( bbp > 0.211591 )
									ret := 0.801802 // buy
							if( basis > 4.16183 )
								if( Upper_Band <= 4.7069 )
									ret := 0.266667
								if( Upper_Band > 4.7069 )
									ret := -0.312500
						if( basis > 4.6895 )
							if( bbp <= 0.336376 )
								ret := 1.000000 // buy
							if( bbp > 0.336376 )
								ret := 0.111111
					if( basis > 4.87939 )
						if( bearPower <= 0.118878 )
							if( Lower_Band <= 5.73925 )
								if( Lower_Band <= 4.72846 )
									ret := -0.455556
								if( Lower_Band > 4.72846 )
									ret := 0.038462
							if( Lower_Band > 5.73925 )
								if( basis <= 6.07791 )
									ret := -0.776119 // sell
								if( basis > 6.07791 )
									ret := -0.237500
						if( bearPower > 0.118878 )
							if( Upper_Band <= 10.2659 )
								if( Upper_Band <= 6.16651 )
									ret := -0.170455
								if( Upper_Band > 6.16651 )
									ret := 0.673913
							if( Upper_Band > 10.2659 )
								ret := -0.947368 // sell
	if( Lower_Band > 6.03638 )
		if( bearPower <= -0.039011 )
			if( basis <= 14.2363 )
				if( Lower_Band <= 6.37915 )
					if( bbp <= -0.026737 )
						if( basis <= 6.10489 )
							if( bullPower <= -0.008719 )
								if( bbp <= -0.060017 )
									ret := -0.666667
								if( bbp > -0.060017 )
									ret := -0.357143
							if( bullPower > -0.008719 )
								if( basis <= 6.10125 )
									ret := -0.736842 // sell
								if( basis > 6.10125 )
									ret := -1.000000 // sell
						if( basis > 6.10489 )
							if( bbm <= 0.04857 )
								if( basis <= 6.52088 )
									ret := 0.025641
								if( basis > 6.52088 )
									ret := -0.632653
							if( bbm > 0.04857 )
								if( bbm <= 0.082073 )
									ret := -0.228616
								if( bbm > 0.082073 )
									ret := -0.037838
					if( bbp > -0.026737 )
						if( bbm <= 0.080318 )
							if( bbp <= -0.018822 )
								if( Lower_Band <= 6.23336 )
									ret := 0.566667
								if( Lower_Band > 6.23336 )
									ret := 0.062500
							if( bbp > -0.018822 )
								if( bbm <= 0.0705 )
									ret := -0.400000
								if( bbm > 0.0705 )
									ret := -0.666667
						if( bbm > 0.080318 )
							if( bearPower <= -0.050276 )
								if( Lower_Band <= 6.13956 )
									ret := 0.782609 // buy
								if( Lower_Band > 6.13956 )
									ret := 0.400000
							if( bearPower > -0.050276 )
								if( bbp <= 0.008488 )
									ret := 0.090909
								if( bbp > 0.008488 )
									ret := 0.000000
				if( Lower_Band > 6.37915 )
					if( Upper_Band <= 13.1821 )
						if( Upper_Band <= 13.1174 )
							if( bbp <= -0.044497 )
								if( bbp <= -0.047577 )
									ret := 0.054524
								if( bbp > -0.047577 )
									ret := 0.302961
							if( bbp > -0.044497 )
								if( Lower_Band <= 7.03669 )
									ret := 0.050655
								if( Lower_Band > 7.03669 )
									ret := -0.110206
						if( Upper_Band > 13.1174 )
							if( bullPower <= -0.018546 )
								if( basis <= 12.8213 )
									ret := -0.666667
								if( basis > 12.8213 )
									ret := -0.977778 // sell
							if( bullPower > -0.018546 )
								ret := -0.555556
					if( Upper_Band > 13.1821 )
						if( bearPower <= -0.149451 )
							if( bullPower <= -0.081198 )
								if( Upper_Band <= 14.2933 )
									ret := 0.961039 // buy
								if( Upper_Band > 14.2933 )
									ret := 0.564706
							if( bullPower > -0.081198 )
								if( bullPower <= -0.03774 )
									ret := 0.024096
								if( bullPower > -0.03774 )
									ret := 0.746835 // buy
						if( bearPower > -0.149451 )
							if( basis <= 14.2099 )
								if( Upper_Band <= 14.2199 )
									ret := -0.069767
								if( Upper_Band > 14.2199 )
									ret := 0.415929
							if( basis > 14.2099 )
								if( Upper_Band <= 14.4019 )
									ret := 0.200000
								if( Upper_Band > 14.4019 )
									ret := -0.941176 // sell
			if( basis > 14.2363 )
				if( Lower_Band <= 13.961 )
					ret := 0.800000 // buy
				if( Lower_Band > 13.961 )
					if( basis <= 14.8079 )
						if( bbm <= 0.140932 )
							if( bbm <= 0.081122 )
								if( Upper_Band <= 14.6473 )
									ret := -0.617647
								if( Upper_Band > 14.6473 )
									ret := 0.000000
							if( bbm > 0.081122 )
								if( basis <= 14.2576 )
									ret := -1.000000 // sell
								if( basis > 14.2576 )
									ret := -0.828571 // sell
						if( bbm > 0.140932 )
							if( Upper_Band <= 15.0088 )
								if( Lower_Band <= 14.1639 )
									ret := -0.642857
								if( Lower_Band > 14.1639 )
									ret := 0.058824
							if( Upper_Band > 15.0088 )
								ret := 0.230769
					if( basis > 14.8079 )
						if( bbm <= 0.176996 )
							if( bbm <= 0.089611 )
								if( bullPower <= -0.032594 )
									ret := 0.181818
								if( bullPower > -0.032594 )
									ret := -0.833333 // sell
							if( bbm > 0.089611 )
								if( Lower_Band <= 14.7825 )
									ret := 0.459459
								if( Lower_Band > 14.7825 )
									ret := -0.256098
						if( bbm > 0.176996 )
							if( bbm <= 0.268664 )
								if( Upper_Band <= 15.9586 )
									ret := -0.739130 // sell
								if( Upper_Band > 15.9586 )
									ret := -0.333333
							if( bbm > 0.268664 )
								if( Lower_Band <= 15.2179 )
									ret := 0.764706 // buy
								if( Lower_Band > 15.2179 )
									ret := -0.500000
		if( bearPower > -0.039011 )
			if( bearPower <= 0.209178 )
				if( bullPower <= 0.36316 )
					if( Upper_Band <= 7.16271 )
						if( bullPower <= 0.033191 )
							if( Upper_Band <= 7.12336 )
								if( Upper_Band <= 7.09956 )
									ret := -0.053500
								if( Upper_Band > 7.09956 )
									ret := -0.351852
							if( Upper_Band > 7.12336 )
								if( bbm <= 0.042983 )
									ret := 0.390152
								if( bbm > 0.042983 )
									ret := -0.222222
						if( bullPower > 0.033191 )
							if( Lower_Band <= 6.16101 )
								if( Upper_Band <= 6.69766 )
									ret := -0.054244
								if( Upper_Band > 6.69766 )
									ret := -0.792683 // sell
							if( Lower_Band > 6.16101 )
								if( bbp <= 0.076922 )
									ret := 0.126488
								if( bbp > 0.076922 )
									ret := -0.024185
					if( Upper_Band > 7.16271 )
						if( Lower_Band <= 9.11726 )
							if( bbm <= 0.056093 )
								if( Lower_Band <= 8.99805 )
									ret := -0.087883
								if( Lower_Band > 8.99805 )
									ret := -0.549296
							if( bbm > 0.056093 )
								if( Upper_Band <= 8.98866 )
									ret := -0.165717
								if( Upper_Band > 8.98866 )
									ret := -0.334120
						if( Lower_Band > 9.11726 )
							if( Lower_Band <= 9.20347 )
								if( bearPower <= 0.038754 )
									ret := 0.654321
								if( bearPower > 0.038754 )
									ret := 0.224490
							if( Lower_Band > 9.20347 )
								if( bearPower <= 0.00539 )
									ret := -0.101826
								if( bearPower > 0.00539 )
									ret := -0.008577
				if( bullPower > 0.36316 )
					if( bullPower <= 0.802175 )
						if( bbp <= 0.697934 )
							if( Upper_Band <= 7.86865 )
								ret := -1.000000 // sell
							if( Upper_Band > 7.86865 )
								if( Upper_Band <= 11.2148 )
									ret := 0.118644
								if( Upper_Band > 11.2148 )
									ret := -0.609756
						if( bbp > 0.697934 )
							if( Upper_Band <= 12.5595 )
								ret := 0.333333
							if( Upper_Band > 12.5595 )
								ret := 0.812500 // buy
					if( bullPower > 0.802175 )
						ret := -0.958333 // sell
			if( bearPower > 0.209178 )
				if( Lower_Band <= 10.7823 )
					if( Upper_Band <= 9.29581 )
						if( bearPower <= 0.386742 )
							if( bbp <= 0.922136 )
								if( bullPower <= 0.478038 )
									ret := 0.469388
								if( bullPower > 0.478038 )
									ret := 1.000000 // buy
							if( bbp > 0.922136 )
								ret := -0.181818
						if( bearPower > 0.386742 )
							ret := 1.000000 // buy
					if( Upper_Band > 9.29581 )
						if( Upper_Band <= 10.1422 )
							if( bearPower <= 0.242506 )
								ret := -0.500000
							if( bearPower > 0.242506 )
								if( Lower_Band <= 7.91457 )
									ret := -1.000000 // sell
								if( Lower_Band > 7.91457 )
									ret := -0.928571 // sell
						if( Upper_Band > 10.1422 )
							if( Upper_Band <= 11.2787 )
								if( Lower_Band <= 9.15131 )
									ret := -0.636364
								if( Lower_Band > 9.15131 )
									ret := 0.700000 // buy
							if( Upper_Band > 11.2787 )
								if( Lower_Band <= 10.6067 )
									ret := -1.000000 // sell
								if( Lower_Band > 10.6067 )
									ret := -0.428571
				if( Lower_Band > 10.7823 )
					if( bbm <= 0.5002 )
						if( Upper_Band <= 13.6918 )
							if( bbm <= 0.2945 )
								ret := 1.000000 // buy
							if( bbm > 0.2945 )
								ret := 0.714286 // buy
						if( Upper_Band > 13.6918 )
							if( bbp <= 0.91451 )
								ret := 1.000000 // buy
							if( bbp > 0.91451 )
								if( bullPower <= 0.673676 )
									ret := 0.777778 // buy
								if( bullPower > 0.673676 )
									ret := 1.000000 // buy
					if( bbm > 0.5002 )
						ret := -0.333333
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_UNIUSDT_15Min_738d8497(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


