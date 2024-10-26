//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: ADSK_15Min_2CT0_f08f727a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2CT0_f08f727a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_f08f727a(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= 470.56 )
		if( tema <= 196.317 )
			if( mf <= 0.189293 )
				if( ema3 <= 122.111 )
					if( ad_mf <= 0.145872 )
						if( ema1 <= 115.332 )
							if( ema13 <= 0.167355 )
								if( ema2 <= 115.065 )
									ret := -0.070769
								if( ema2 > 115.065 )
									ret := 0.394366
							if( ema13 > 0.167355 )
								if( ema13 <= 0.722002 )
									ret := 0.098410
								if( ema13 > 0.722002 )
									ret := 0.395349
						if( ema1 > 115.332 )
							if( ema13 <= 0.223404 )
								if( ema2 <= 116.668 )
									ret := -0.463415
								if( ema2 > 116.668 )
									ret := -0.088889
							if( ema13 > 0.223404 )
								if( ema13 <= 0.372279 )
									ret := 0.395833
								if( ema13 > 0.372279 )
									ret := -0.108787
					if( ad_mf > 0.145872 )
						if( tema <= 107.712 )
							if( ema1 <= 103.604 )
								if( ema3 <= 83.0428 )
									ret := 0.869565 // buy
								if( ema3 > 83.0428 )
									ret := 0.512821
							if( ema1 > 103.604 )
								if( ad_mf <= 0.397092 )
									ret := 0.969697 // buy
								if( ad_mf > 0.397092 )
									ret := 0.437500
						if( tema > 107.712 )
							if( mf <= -0.267144 )
								if( ema3 <= 113.864 )
									ret := -0.966667 // sell
								if( ema3 > 113.864 )
									ret := -0.461538
							if( mf > -0.267144 )
								if( ema3 <= 113.804 )
									ret := -0.285714
								if( ema3 > 113.804 )
									ret := 0.193548
				if( ema3 > 122.111 )
					if( ema12 <= 0.596199 )
						if( ad_mf <= 424.728 )
							if( ema12 <= -1.27835 )
								if( mf <= 0.107329 )
									ret := 0.222661
								if( mf > 0.107329 )
									ret := -0.428571
							if( ema12 > -1.27835 )
								if( ema3 <= 130.452 )
									ret := 0.148678
								if( ema3 > 130.452 )
									ret := 0.038712
						if( ad_mf > 424.728 )
							ret := 0.846154 // buy
					if( ema12 > 0.596199 )
						if( mf <= -0.143391 )
							if( ad_mf <= -173514 )
								ret := -0.923077 // sell
							if( ad_mf > -173514 )
								if( ad_mf <= -7254.97 )
									ret := 0.223684
								if( ad_mf > -7254.97 )
									ret := -0.333333
						if( mf > -0.143391 )
							if( ema3 <= 177.314 )
								if( tema <= 178.847 )
									ret := 0.246667
								if( tema > 178.847 )
									ret := 0.866667 // buy
							if( ema3 > 177.314 )
								if( ema3 <= 191.834 )
									ret := -0.020134
								if( ema3 > 191.834 )
									ret := 0.531915
			if( mf > 0.189293 )
				if( ad_mf <= -0.666468 )
					if( ad_mf <= -6619.56 )
						if( ad_mf <= -53788.9 )
							if( ad_mf <= -93162.2 )
								if( ema13 <= -0.142008 )
									ret := 1.000000 // buy
								if( ema13 > -0.142008 )
									ret := 0.000000
							if( ad_mf > -93162.2 )
								if( mf <= 0.209013 )
									ret := 0.000000
								if( mf > 0.209013 )
									ret := -0.451128
						if( ad_mf > -53788.9 )
							if( ema13 <= 0.430091 )
								if( ad <= -48326.8 )
									ret := 0.666667
								if( ad > -48326.8 )
									ret := -0.114241
							if( ema13 > 0.430091 )
								if( ad_mf <= -52346.3 )
									ret := 0.947368 // buy
								if( ad_mf > -52346.3 )
									ret := 0.095238
					if( ad_mf > -6619.56 )
						if( ema3 <= 155.33 )
							if( ema3 <= 94.9622 )
								ret := -0.296296
							if( ema3 > 94.9622 )
								if( ema3 <= 122.865 )
									ret := 0.697248
								if( ema3 > 122.865 )
									ret := 0.320000
						if( ema3 > 155.33 )
							if( ad_mf <= -4031.52 )
								if( tema <= 189.87 )
									ret := 0.138889
								if( tema > 189.87 )
									ret := 0.909091 // buy
							if( ad_mf > -4031.52 )
								if( ad <= -3729.7 )
									ret := -0.777778 // sell
								if( ad > -3729.7 )
									ret := -0.142857
				if( ad_mf > -0.666468 )
					if( ema1 <= 135.084 )
						if( ema3 <= 84.8357 )
							if( ema2 <= 84.1798 )
								if( tema <= 81.5838 )
									ret := -0.812500 // sell
								if( tema > 81.5838 )
									ret := -0.615385
							if( ema2 > 84.1798 )
								ret := -1.000000 // sell
						if( ema3 > 84.8357 )
							if( ema13 <= 0.297131 )
								if( ad_mf <= -0.279712 )
									ret := 0.147727
								if( ad_mf > -0.279712 )
									ret := -0.442308
							if( ema13 > 0.297131 )
								if( mf <= 0.498367 )
									ret := 0.433526
								if( mf > 0.498367 )
									ret := -0.600000
					if( ema1 > 135.084 )
						if( ema3 <= 139.092 )
							if( ema3 <= 136.383 )
								ret := -0.150000
							if( ema3 > 136.383 )
								if( ema2 <= 139.188 )
									ret := -0.962264 // sell
								if( ema2 > 139.188 )
									ret := -0.666667
						if( ema3 > 139.092 )
							if( ema12 <= 0.801599 )
								if( ema12 <= 0.587876 )
									ret := -0.158358
								if( ema12 > 0.587876 )
									ret := 0.764706 // buy
							if( ema12 > 0.801599 )
								if( ema3 <= 144.909 )
									ret := 0.375000
								if( ema3 > 144.909 )
									ret := -0.855769 // sell
		if( tema > 196.317 )
			if( ad <= -6920.67 )
				if( ad_mf <= -7956.04 )
					if( ema3 <= 194.247 )
						if( ema2 <= 194.244 )
							ret := 0.800000 // buy
						if( ema2 > 194.244 )
							ret := 0.294118
					if( ema3 > 194.247 )
						if( ad_mf <= -258188 )
							if( ad_mf <= -340080 )
								if( ad_mf <= -444769 )
									ret := 0.553846
								if( ad_mf > -444769 )
									ret := -0.327586
							if( ad_mf > -340080 )
								if( tema <= 228.61 )
									ret := 0.829268 // buy
								if( tema > 228.61 )
									ret := 0.441176
						if( ad_mf > -258188 )
							if( ad_mf <= -24274.4 )
								if( ema13 <= -0.499436 )
									ret := -0.065677
								if( ema13 > -0.499436 )
									ret := 0.032774
							if( ad_mf > -24274.4 )
								if( ema2 <= 213.973 )
									ret := -0.129967
								if( ema2 > 213.973 )
									ret := -0.043504
				if( ad_mf > -7956.04 )
					if( ad_mf <= -7051.18 )
						if( ema12 <= -0.861893 )
							if( ema12 <= -1.37661 )
								ret := 0.714286 // buy
							if( ema12 > -1.37661 )
								if( ema1 <= 260.726 )
									ret := -0.050000
								if( ema1 > 260.726 )
									ret := 0.615385
						if( ema12 > -0.861893 )
							if( ema12 <= 1.28428 )
								if( ad <= -7200.96 )
									ret := -0.321918
								if( ad > -7200.96 )
									ret := 0.032258
							if( ema12 > 1.28428 )
								ret := -0.937500 // sell
					if( ad_mf > -7051.18 )
						if( ema1 <= 208.214 )
							ret := 0.090909
						if( ema1 > 208.214 )
							if( ema1 <= 247.987 )
								if( ema12 <= -0.145897 )
									ret := -0.967742 // sell
								if( ema12 > -0.145897 )
									ret := -0.722222 // sell
							if( ema1 > 247.987 )
								if( ema3 <= 282.359 )
									ret := 0.000000
								if( ema3 > 282.359 )
									ret := -0.571429
			if( ad > -6920.67 )
				if( ema3 <= 250.36 )
					if( ema1 <= 249.639 )
						if( ema1 <= 196.588 )
							if( ad_mf <= -441.393 )
								ret := 0.352941
							if( ad_mf > -441.393 )
								if( ema12 <= 0.533349 )
									ret := -0.902439 // sell
								if( ema12 > 0.533349 )
									ret := -0.375000
						if( ema1 > 196.588 )
							if( tema <= 199.807 )
								if( ema1 <= 198.779 )
									ret := 0.067227
								if( ema1 > 198.779 )
									ret := 0.358079
							if( tema > 199.807 )
								if( tema <= 200.146 )
									ret := -0.524272
								if( tema > 200.146 )
									ret := -0.010275
					if( ema1 > 249.639 )
						if( ema13 <= 1.22152 )
							if( ema12 <= 0.233538 )
								ret := -0.733333 // sell
							if( ema12 > 0.233538 )
								ret := -0.300000
						if( ema13 > 1.22152 )
							if( ema3 <= 248.128 )
								ret := -0.583333
							if( ema3 > 248.128 )
								if( ema3 <= 249.567 )
									ret := -1.000000 // sell
								if( ema3 > 249.567 )
									ret := -0.909091 // sell
				if( ema3 > 250.36 )
					if( tema <= 253.676 )
						if( ema2 <= 256.707 )
							if( ema2 <= 250.746 )
								if( ema1 <= 250.438 )
									ret := 0.920000 // buy
								if( ema1 > 250.438 )
									ret := 0.545455
							if( ema2 > 250.746 )
								if( ema1 <= 251.822 )
									ret := 0.224299
								if( ema1 > 251.822 )
									ret := 0.702128 // buy
						if( ema2 > 256.707 )
							ret := 1.000000 // buy
					if( tema > 253.676 )
						if( ema12 <= 1.06479 )
							if( ema13 <= -2.62818 )
								if( ad <= -426.4 )
									ret := 0.674157
								if( ad > -426.4 )
									ret := 0.341463
							if( ema13 > -2.62818 )
								if( ema2 <= 289.016 )
									ret := 0.155647
								if( ema2 > 289.016 )
									ret := -0.015130
						if( ema12 > 1.06479 )
							if( ad <= -380 )
								if( ad_mf <= -1563.38 )
									ret := -0.246575
								if( ad_mf > -1563.38 )
									ret := 0.387097
							if( ad > -380 )
								if( tema <= 273.522 )
									ret := -0.343750
								if( tema > 273.522 )
									ret := -0.881356 // sell
	if( ad > 470.56 )
		if( ema2 <= 227.722 )
			if( ema1 <= 223.529 )
				if( ad <= 480.778 )
					ret := -0.869565 // sell
				if( ad > 480.778 )
					if( ema3 <= 199.099 )
						if( ad <= 5213.98 )
							if( ad <= 2162.79 )
								if( ema12 <= -1.63089 )
									ret := -0.812500 // sell
								if( ema12 > -1.63089 )
									ret := 0.000000
							if( ad > 2162.79 )
								if( ema12 <= -0.726614 )
									ret := 0.738636 // buy
								if( ema12 > -0.726614 )
									ret := 0.191756
						if( ad > 5213.98 )
							if( ad_mf <= 6413.79 )
								if( ema1 <= 185.771 )
									ret := -0.109510
								if( ema1 > 185.771 )
									ret := -0.577465
							if( ad_mf > 6413.79 )
								if( ema3 <= 198.897 )
									ret := 0.014068
								if( ema3 > 198.897 )
									ret := 0.588235
					if( ema3 > 199.099 )
						if( ema3 <= 200.768 )
							if( ema13 <= 0.748912 )
								if( ema13 <= -0.947766 )
									ret := -0.361446
								if( ema13 > -0.947766 )
									ret := -0.088561
							if( ema13 > 0.748912 )
								if( ema12 <= 0.518896 )
									ret := -0.826087 // sell
								if( ema12 > 0.518896 )
									ret := -0.370000
						if( ema3 > 200.768 )
							if( ema13 <= 0.128142 )
								if( ema13 <= -2.72778 )
									ret := 0.215385
								if( ema13 > -2.72778 )
									ret := -0.100732
							if( ema13 > 0.128142 )
								if( ad <= 147098 )
									ret := 0.055385
								if( ad > 147098 )
									ret := -0.322917
			if( ema1 > 223.529 )
				if( ad_mf <= 65817.3 )
					if( ema13 <= -0.349392 )
						if( tema <= 226.563 )
							if( ema1 <= 226.195 )
								if( ema12 <= -0.46051 )
									ret := -0.363636
								if( ema12 > -0.46051 )
									ret := 0.000000
							if( ema1 > 226.195 )
								ret := 0.636364
						if( tema > 226.563 )
							ret := -0.764706 // sell
					if( ema13 > -0.349392 )
						if( ad <= 18786.6 )
							if( mf <= 0.171414 )
								if( ema12 <= 0.573849 )
									ret := 0.011905
								if( ema12 > 0.573849 )
									ret := 0.512821
							if( mf > 0.171414 )
								if( ema12 <= 0.739778 )
									ret := -0.600000
								if( ema12 > 0.739778 )
									ret := 0.071429
						if( ad > 18786.6 )
							if( ad <= 53626.4 )
								if( ema13 <= -0.095959 )
									ret := 0.933333 // buy
								if( ema13 > -0.095959 )
									ret := 0.415205
							if( ad > 53626.4 )
								ret := -0.176471
				if( ad_mf > 65817.3 )
					if( ema3 <= 225.078 )
						if( ema3 <= 224.116 )
							ret := 0.705882 // buy
						if( ema3 > 224.116 )
							ret := 1.000000 // buy
					if( ema3 > 225.078 )
						if( ema2 <= 227.127 )
							if( ad_mf <= 163934 )
								if( ema1 <= 225.934 )
									ret := 0.526316
								if( ema1 > 225.934 )
									ret := 0.071429
							if( ad_mf > 163934 )
								ret := -0.777778 // sell
						if( ema2 > 227.127 )
							ret := 0.875000 // buy
		if( ema2 > 227.722 )
			if( ema13 <= -2.00353 )
				if( mf <= 0.034246 )
					if( ad <= 56123.9 )
						if( ad <= 36301.6 )
							if( ema13 <= -3.3956 )
								if( ema2 <= 253.907 )
									ret := -0.465116
								if( ema2 > 253.907 )
									ret := 0.055556
							if( ema13 > -3.3956 )
								if( ema12 <= -1.48222 )
									ret := -0.231405
								if( ema12 > -1.48222 )
									ret := -0.476923
						if( ad > 36301.6 )
							if( ema12 <= -2.27377 )
								if( ema13 <= -4.45085 )
									ret := -1.000000 // sell
								if( ema13 > -4.45085 )
									ret := -0.736842 // sell
							if( ema12 > -2.27377 )
								if( ema2 <= 262.802 )
									ret := -0.750000 // sell
								if( ema2 > 262.802 )
									ret := -0.030303
					if( ad > 56123.9 )
						if( ema12 <= -3.47955 )
							ret := 0.666667
						if( ema12 > -3.47955 )
							if( ema2 <= 251.176 )
								if( ema12 <= -1.61148 )
									ret := -0.285714
								if( ema12 > -1.61148 )
									ret := 0.791667 // buy
							if( ema2 > 251.176 )
								if( ema1 <= 281.616 )
									ret := -0.617647
								if( ema1 > 281.616 )
									ret := -0.083333
				if( mf > 0.034246 )
					if( ema3 <= 257.345 )
						if( ad <= 19853.4 )
							if( mf <= 0.089591 )
								if( mf <= 0.067526 )
									ret := -0.818182 // sell
								if( mf > 0.067526 )
									ret := -1.000000 // sell
							if( mf > 0.089591 )
								ret := 0.000000
						if( ad > 19853.4 )
							if( ad_mf <= 26213.4 )
								if( tema <= 232.336 )
									ret := 0.857143 // buy
								if( tema > 232.336 )
									ret := -0.111111
							if( ad_mf > 26213.4 )
								if( mf <= 0.057363 )
									ret := 0.416667
								if( mf > 0.057363 )
									ret := -0.500000
					if( ema3 > 257.345 )
						if( ema13 <= -3.47494 )
							ret := -0.294118
						if( ema13 > -3.47494 )
							if( ad <= 12868.3 )
								if( mf <= 0.150811 )
									ret := 0.703704 // buy
								if( mf > 0.150811 )
									ret := -0.062500
							if( ad > 12868.3 )
								if( ad <= 15080.2 )
									ret := -0.875000 // sell
								if( ad > 15080.2 )
									ret := 0.140351
			if( ema13 > -2.00353 )
				if( ema3 <= 266.084 )
					if( ema3 <= 265.83 )
						if( ema3 <= 228.082 )
							if( ema3 <= 227.346 )
								if( ema1 <= 229.747 )
									ret := -0.857143 // sell
								if( ema1 > 229.747 )
									ret := -0.333333
							if( ema3 > 227.346 )
								if( ad <= 30131.5 )
									ret := -0.094340
								if( ad > 30131.5 )
									ret := -0.791667 // sell
						if( ema3 > 228.082 )
							if( ema13 <= 1.5062 )
								if( ema13 <= 1.50154 )
									ret := -0.024758
								if( ema13 > 1.50154 )
									ret := 0.666667
							if( ema13 > 1.5062 )
								if( mf <= 0.075011 )
									ret := -0.342939
								if( mf > 0.075011 )
									ret := -0.054965
					if( ema3 > 265.83 )
						if( ema13 <= -1.11004 )
							ret := 0.111111
						if( ema13 > -1.11004 )
							if( ema1 <= 267.108 )
								ret := 1.000000 // buy
							if( ema1 > 267.108 )
								ret := 0.400000
				if( ema3 > 266.084 )
					if( ema3 <= 267.314 )
						if( tema <= 268.152 )
							if( ema12 <= 0.096697 )
								if( ema13 <= -0.867686 )
									ret := -0.187500
								if( ema13 > -0.867686 )
									ret := -0.656250
							if( ema12 > 0.096697 )
								ret := 0.000000
						if( tema > 268.152 )
							if( ema2 <= 267.464 )
								ret := -1.000000 // sell
							if( ema2 > 267.464 )
								ret := -0.666667
					if( ema3 > 267.314 )
						if( mf <= -0.179359 )
							if( ema12 <= 0.132105 )
								if( ema3 <= 322.496 )
									ret := -0.078947
								if( ema3 > 322.496 )
									ret := 0.421053
							if( ema12 > 0.132105 )
								if( ema3 <= 279.767 )
									ret := 0.379310
								if( ema3 > 279.767 )
									ret := 0.078652
						if( mf > -0.179359 )
							if( ad_mf <= 511.863 )
								if( mf <= -0.082995 )
									ret := -0.900000 // sell
								if( mf > -0.082995 )
									ret := -1.000000 // sell
							if( ad_mf > 511.863 )
								if( ad <= 308896 )
									ret := -0.113540
								if( ad > 308896 )
									ret := -0.777778 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_ADSK_15Min_f08f727a(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


