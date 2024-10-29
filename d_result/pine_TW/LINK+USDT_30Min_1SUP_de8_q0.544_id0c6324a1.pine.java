//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: LINKUSDT_30Min_1SUP_0c6324a1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_30Min_1SUP_0c6324a1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_30Min_0c6324a1(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( dn1 <= 7.30685 )
		if( atr <= 0.057991 )
			if( dn1 <= 6.02451 )
				if( atr2 <= 0.024844 )
					if( up1 <= 5.21 )
						if( dn <= 5.32664 )
							if( dn1 <= 5.25841 )
								ret := 0.000000
							if( dn1 > 5.25841 )
								if( up1 <= 5.17422 )
									ret := -0.285714
								if( up1 > 5.17422 )
									ret := 0.000000
						if( dn > 5.32664 )
							if( up1 <= 5.20745 )
								ret := -0.750000 // sell
							if( up1 > 5.20745 )
								ret := -1.000000 // sell
					if( up1 > 5.21 )
						if( dn <= 5.70184 )
							if( dn <= 5.68585 )
								if( atr <= 0.024784 )
									ret := 0.065934
								if( atr > 0.024784 )
									ret := 0.400000
							if( dn > 5.68585 )
								ret := 1.000000 // buy
						if( dn > 5.70184 )
							if( up1 <= 5.67593 )
								if( dn <= 5.71833 )
									ret := -1.000000 // sell
								if( dn > 5.71833 )
									ret := -0.428571
							if( up1 > 5.67593 )
								if( dn1 <= 6.01943 )
									ret := 0.011494
								if( dn1 > 6.01943 )
									ret := -0.058824
				if( atr2 > 0.024844 )
					if( up1 <= 5.72973 )
						if( up <= 5.62491 )
							if( atr <= 0.052151 )
								if( up1 <= 4.97672 )
									ret := 0.631579
								if( up1 > 4.97672 )
									ret := 0.282883
							if( atr > 0.052151 )
								if( dn1 <= 5.4171 )
									ret := 0.266667
								if( dn1 > 5.4171 )
									ret := -0.333333
						if( up > 5.62491 )
							if( atr <= 0.056433 )
								if( dn <= 5.94912 )
									ret := -0.053846
								if( dn > 5.94912 )
									ret := -0.764706 // sell
							if( atr > 0.056433 )
								ret := 0.611111
					if( up1 > 5.72973 )
						if( atr <= 0.037885 )
							if( atr2 <= 0.034786 )
								if( dn <= 6.00689 )
									ret := 0.612403
								if( dn > 6.00689 )
									ret := 0.000000
							if( atr2 > 0.034786 )
								ret := -0.136364
						if( atr > 0.037885 )
							if( up1 <= 5.77909 )
								if( atr2 <= 0.038334 )
									ret := 1.000000 // buy
								if( atr2 > 0.038334 )
									ret := 0.818182 // buy
							if( up1 > 5.77909 )
								ret := 0.600000
			if( dn1 > 6.02451 )
				if( dn1 <= 6.16477 )
					if( atr <= 0.038728 )
						if( dn1 <= 6.06287 )
							if( up1 <= 5.82622 )
								ret := 0.562500
							if( up1 > 5.82622 )
								if( up <= 5.88559 )
									ret := 0.266667
								if( up > 5.88559 )
									ret := 0.022099
						if( dn1 > 6.06287 )
							if( atr2 <= 0.034012 )
								if( dn <= 6.06842 )
									ret := -0.357143
								if( dn > 6.06842 )
									ret := -0.029536
							if( atr2 > 0.034012 )
								if( up <= 5.95309 )
									ret := -0.126582
								if( up > 5.95309 )
									ret := -1.000000 // sell
					if( atr > 0.038728 )
						if( atr <= 0.044516 )
							if( dn <= 6.11323 )
								if( atr2 <= 0.0469 )
									ret := -0.822785 // sell
								if( atr2 > 0.0469 )
									ret := 0.071429
							if( dn > 6.11323 )
								if( atr <= 0.040782 )
									ret := -0.083333
								if( atr > 0.040782 )
									ret := -0.457143
						if( atr > 0.044516 )
							if( dn <= 6.13283 )
								if( dn <= 6.067 )
									ret := -0.355556
								if( dn > 6.067 )
									ret := 0.209302
							if( dn > 6.13283 )
								if( up1 <= 5.85075 )
									ret := -0.812500 // sell
								if( up1 > 5.85075 )
									ret := -0.200000
				if( dn1 > 6.16477 )
					if( dn1 <= 6.28369 )
						if( atr <= 0.030067 )
							if( dn <= 6.27626 )
								if( up <= 6.11488 )
									ret := -0.021390
								if( up > 6.11488 )
									ret := -0.135417
							if( dn > 6.27626 )
								ret := 0.125000
						if( atr > 0.030067 )
							if( dn1 <= 6.26998 )
								if( atr <= 0.039004 )
									ret := 0.291139
								if( atr > 0.039004 )
									ret := 0.065089
							if( dn1 > 6.26998 )
								if( up1 <= 5.98677 )
									ret := -0.142857
								if( up1 > 5.98677 )
									ret := 0.628571
					if( dn1 > 6.28369 )
						if( dn <= 6.45124 )
							if( up <= 6.07529 )
								if( dn <= 6.32187 )
									ret := -0.145349
								if( dn > 6.32187 )
									ret := -0.454054
							if( up > 6.07529 )
								if( dn <= 6.3773 )
									ret := 0.085227
								if( dn > 6.3773 )
									ret := -0.147632
						if( dn > 6.45124 )
							if( atr <= 0.052709 )
								if( up1 <= 6.35055 )
									ret := 0.139535
								if( up1 > 6.35055 )
									ret := -0.030031
							if( atr > 0.052709 )
								if( up1 <= 6.76688 )
									ret := 0.245150
								if( up1 > 6.76688 )
									ret := -0.052273
		if( atr > 0.057991 )
			if( up <= 6.37592 )
				if( atr <= 0.075062 )
					if( dn1 <= 6.38875 )
						if( up <= 5.99859 )
							if( atr <= 0.059785 )
								if( up <= 5.93795 )
									ret := -0.166667
								if( up > 5.93795 )
									ret := -0.666667
							if( atr > 0.059785 )
								if( dn <= 6.00193 )
									ret := 0.276316
								if( dn > 6.00193 )
									ret := 0.586466
						if( up > 5.99859 )
							if( atr2 <= 0.0596 )
								ret := -0.421053
							if( atr2 > 0.0596 )
								ret := 0.277778
					if( dn1 > 6.38875 )
						if( up1 <= 6.13916 )
							if( up <= 6.05552 )
								if( atr <= 0.062448 )
									ret := -0.583333
								if( atr > 0.062448 )
									ret := 0.258824
							if( up > 6.05552 )
								if( atr2 <= 0.0604 )
									ret := -0.066667
								if( atr2 > 0.0604 )
									ret := -0.323944
						if( up1 > 6.13916 )
							if( up1 <= 6.25699 )
								if( atr2 <= 0.076843 )
									ret := 0.455026
								if( atr2 > 0.076843 )
									ret := -0.235294
							if( up1 > 6.25699 )
								if( dn <= 6.71354 )
									ret := -0.116129
								if( dn > 6.71354 )
									ret := 0.333333
				if( atr > 0.075062 )
					if( up1 <= 5.7936 )
						if( up <= 5.41943 )
							if( atr2 <= 0.2705 )
								if( atr <= 0.202173 )
									ret := 0.682540
								if( atr > 0.202173 )
									ret := -0.166667
							if( atr2 > 0.2705 )
								if( atr <= 0.298084 )
									ret := 1.000000 // buy
								if( atr > 0.298084 )
									ret := 0.761905 // buy
						if( up > 5.41943 )
							if( atr <= 0.205931 )
								if( up1 <= 5.62334 )
									ret := -0.103286
								if( up1 > 5.62334 )
									ret := 0.545872
							if( atr > 0.205931 )
								if( atr2 <= 0.217721 )
									ret := -0.906250 // sell
								if( atr2 > 0.217721 )
									ret := -0.203125
					if( up1 > 5.7936 )
						if( dn <= 7.09289 )
							if( atr2 <= 0.107997 )
								if( dn <= 6.79936 )
									ret := -0.125333
								if( dn > 6.79936 )
									ret := -0.656566
							if( atr2 > 0.107997 )
								if( atr2 <= 0.112889 )
									ret := 0.433824
								if( atr2 > 0.112889 )
									ret := -0.108652
						if( dn > 7.09289 )
							if( atr2 <= 0.221387 )
								if( dn <= 7.24869 )
									ret := -0.597561
								if( dn > 7.24869 )
									ret := 0.235294
							if( atr2 > 0.221387 )
								ret := -0.900000 // sell
			if( up > 6.37592 )
				if( up <= 6.61193 )
					if( dn <= 6.80309 )
						if( up <= 6.425 )
							if( dn1 <= 6.80854 )
								if( up1 <= 6.36638 )
									ret := 0.636364
								if( up1 > 6.36638 )
									ret := 0.053571
							if( dn1 > 6.80854 )
								ret := 0.923077 // buy
						if( up > 6.425 )
							if( up1 <= 6.43525 )
								if( up1 <= 6.41098 )
									ret := 1.000000 // buy
								if( up1 > 6.41098 )
									ret := 0.866667 // buy
							if( up1 > 6.43525 )
								if( up1 <= 6.47456 )
									ret := 0.076923
								if( up1 > 6.47456 )
									ret := 0.722222 // buy
					if( dn > 6.80309 )
						if( dn <= 6.87739 )
							if( dn <= 6.85879 )
								if( dn1 <= 6.81755 )
									ret := -0.148148
								if( dn1 > 6.81755 )
									ret := 0.416667
							if( dn > 6.85879 )
								if( atr <= 0.074917 )
									ret := -0.666667
								if( atr > 0.074917 )
									ret := 0.090909
						if( dn > 6.87739 )
							if( atr <= 0.103921 )
								if( atr <= 0.086514 )
									ret := 0.318555
								if( atr > 0.086514 )
									ret := 0.699588
							if( atr > 0.103921 )
								if( up <= 6.48265 )
									ret := -0.219653
								if( up > 6.48265 )
									ret := 0.469880
				if( up > 6.61193 )
					if( dn <= 7.19222 )
						if( dn1 <= 6.9874 )
							if( up <= 6.62968 )
								if( up1 <= 6.60445 )
									ret := -0.518519
								if( up1 > 6.60445 )
									ret := -0.833333 // sell
							if( up > 6.62968 )
								if( up1 <= 6.64514 )
									ret := 0.166667
								if( up1 > 6.64514 )
									ret := -0.666667
						if( dn1 > 6.9874 )
							if( dn1 <= 7.10398 )
								if( up <= 6.72602 )
									ret := 0.188552
								if( up > 6.72602 )
									ret := 0.629630
							if( dn1 > 7.10398 )
								if( trend <= 0 )
									ret := 0.391304
								if( trend > 0 )
									ret := -0.115658
					if( dn > 7.19222 )
						if( up <= 6.72103 )
							if( atr2 <= 0.114959 )
								if( dn1 <= 7.28568 )
									ret := 0.148148
								if( dn1 > 7.28568 )
									ret := -0.906250 // sell
							if( atr2 > 0.114959 )
								ret := 0.812500 // buy
						if( up > 6.72103 )
							if( dn1 <= 7.27351 )
								if( atr2 <= 0.085406 )
									ret := 0.414566
								if( atr2 > 0.085406 )
									ret := 0.727273 // buy
							if( dn1 > 7.27351 )
								if( dn1 <= 7.27685 )
									ret := -0.457143
								if( dn1 > 7.27685 )
									ret := 0.239819
	if( dn1 > 7.30685 )
		if( atr2 <= 0.897444 )
			if( trend <= 0.969388 )
				if( dn <= 27.4044 )
					if( atr <= 0.33249 )
						if( up1 <= 18.0755 )
							if( up <= 7.02501 )
								ret := 0.666667
							if( up > 7.02501 )
								if( atr <= 0.079934 )
									ret := 0.222222
								if( atr > 0.079934 )
									ret := -0.493151
						if( up1 > 18.0755 )
							ret := 0.923077 // buy
					if( atr > 0.33249 )
						if( up <= 20.2961 )
							ret := 1.000000 // buy
						if( up > 20.2961 )
							ret := 0.230769
				if( dn > 27.4044 )
					if( dn1 <= 28.8693 )
						ret := -1.000000 // sell
					if( dn1 > 28.8693 )
						ret := -0.384615
			if( trend > 0.969388 )
				if( up1 <= 34.812 )
					if( atr <= 0.564511 )
						if( up1 <= 6.94148 )
							if( dn1 <= 7.47153 )
								if( dn <= 7.38515 )
									ret := -0.051535
								if( dn > 7.38515 )
									ret := 0.215247
							if( dn1 > 7.47153 )
								if( atr2 <= 0.503051 )
									ret := -0.393742
								if( atr2 > 0.503051 )
									ret := 1.000000 // buy
						if( up1 > 6.94148 )
							if( atr2 <= 0.592774 )
								if( up1 <= 23.0487 )
									ret := -0.022580
								if( up1 > 23.0487 )
									ret := 0.016373
							if( atr2 > 0.592774 )
								if( atr <= 0.497282 )
									ret := 0.363636
								if( atr > 0.497282 )
									ret := -0.422222
					if( atr > 0.564511 )
						if( up <= 22.041 )
							if( atr2 <= 0.657639 )
								if( dn1 <= 21.8332 )
									ret := 0.521739
								if( dn1 > 21.8332 )
									ret := -0.113744
							if( atr2 > 0.657639 )
								if( atr <= 0.884363 )
									ret := 0.619883
								if( atr > 0.884363 )
									ret := -1.000000 // sell
						if( up > 22.041 )
							if( dn <= 27.2339 )
								if( dn1 <= 26.02 )
									ret := 0.369565
								if( dn1 > 26.02 )
									ret := -0.423077
							if( dn > 27.2339 )
								if( dn <= 27.6644 )
									ret := 0.678788
								if( dn > 27.6644 )
									ret := 0.071811
				if( up1 > 34.812 )
					if( atr2 <= 0.406459 )
						if( dn <= 39.2141 )
							if( up1 <= 36.8426 )
								if( atr <= 0.36604 )
									ret := 1.000000 // buy
								if( atr > 0.36604 )
									ret := 0.717391 // buy
							if( up1 > 36.8426 )
								ret := 0.200000
						if( dn > 39.2141 )
							if( dn1 <= 41.3924 )
								if( atr <= 0.390931 )
									ret := -0.150000
								if( atr > 0.390931 )
									ret := 0.307692
							if( dn1 > 41.3924 )
								ret := -0.681818
					if( atr2 > 0.406459 )
						if( up1 <= 36.5988 )
							if( dn1 <= 40.704 )
								if( atr2 <= 0.725087 )
									ret := -0.585253
								if( atr2 > 0.725087 )
									ret := -0.913793 // sell
							if( dn1 > 40.704 )
								if( dn <= 41.246 )
									ret := 0.148936
								if( dn > 41.246 )
									ret := -1.000000 // sell
						if( up1 > 36.5988 )
							if( dn1 <= 41.9131 )
								if( atr2 <= 0.82681 )
									ret := 0.305085
								if( atr2 > 0.82681 )
									ret := -0.631579
							if( dn1 > 41.9131 )
								if( dn <= 46.9368 )
									ret := -0.427046
								if( dn > 46.9368 )
									ret := -0.092338
		if( atr2 > 0.897444 )
			if( up1 <= 21.2472 )
				if( dn <= 23.0843 )
					if( dn1 <= 23.096 )
						if( atr <= 1.13078 )
							if( dn <= 22.2168 )
								if( up1 <= 14.967 )
									ret := -0.571429
								if( up1 > 14.967 )
									ret := 0.409091
							if( dn > 22.2168 )
								ret := -1.000000 // sell
						if( atr > 1.13078 )
							if( up1 <= 14.8856 )
								ret := 1.000000 // buy
							if( up1 > 14.8856 )
								ret := 0.285714
					if( dn1 > 23.096 )
						ret := 1.000000 // buy
				if( dn > 23.0843 )
					if( up <= 21.3375 )
						if( atr <= 1.02168 )
							ret := 0.750000 // buy
						if( atr > 1.02168 )
							if( dn <= 26.9551 )
								if( dn1 <= 26.2306 )
									ret := 1.000000 // buy
								if( dn1 > 26.2306 )
									ret := 0.666667
							if( dn > 26.9551 )
								ret := 1.000000 // buy
					if( up > 21.3375 )
						ret := -0.125000
			if( up1 > 21.2472 )
				if( atr2 <= 1.1289 )
					if( atr2 <= 1.0963 )
						if( atr <= 0.918427 )
							if( dn <= 40.1067 )
								if( dn1 <= 34.6715 )
									ret := -0.322581
								if( dn1 > 34.6715 )
									ret := 0.851064 // buy
							if( dn > 40.1067 )
								if( up <= 43.7493 )
									ret := -0.549550
								if( up > 43.7493 )
									ret := 0.444444
						if( atr > 0.918427 )
							if( up1 <= 25.6624 )
								if( dn1 <= 31.3203 )
									ret := -0.363636
								if( dn1 > 31.3203 )
									ret := -1.000000 // sell
							if( up1 > 25.6624 )
								if( dn <= 43.2161 )
									ret := 0.457227
								if( dn > 43.2161 )
									ret := -0.053232
					if( atr2 > 1.0963 )
						if( dn <= 42.8773 )
							if( atr <= 1.18127 )
								if( atr <= 1.10895 )
									ret := 0.924528 // buy
								if( atr > 1.10895 )
									ret := 0.603448
							if( atr > 1.18127 )
								ret := -0.285714
						if( dn > 42.8773 )
							if( dn1 <= 45.0179 )
								ret := -1.000000 // sell
							if( dn1 > 45.0179 )
								ret := 0.000000
				if( atr2 > 1.1289 )
					if( up1 <= 24.2741 )
						if( dn1 <= 32.5057 )
							if( dn1 <= 31.012 )
								if( atr2 <= 1.20515 )
									ret := -0.937500 // sell
								if( atr2 > 1.20515 )
									ret := -0.485714
							if( dn1 > 31.012 )
								if( atr <= 1.42808 )
									ret := -0.600000
								if( atr > 1.42808 )
									ret := 0.842105 // buy
						if( dn1 > 32.5057 )
							if( atr2 <= 1.62817 )
								if( up1 <= 23.0707 )
									ret := -1.000000 // sell
								if( up1 > 23.0707 )
									ret := -0.555556
							if( atr2 > 1.62817 )
								ret := -1.000000 // sell
					if( up1 > 24.2741 )
						if( up <= 27.7657 )
							if( dn1 <= 34.6852 )
								if( up1 <= 26.4428 )
									ret := 0.617021
								if( up1 > 26.4428 )
									ret := 0.875000 // buy
							if( dn1 > 34.6852 )
								if( dn1 <= 35.0112 )
									ret := 0.000000
								if( dn1 > 35.0112 )
									ret := -0.428571
						if( up > 27.7657 )
							if( dn1 <= 39.8386 )
								if( dn <= 38.4109 )
									ret := -0.353659
								if( dn > 38.4109 )
									ret := -0.933333 // sell
							if( dn1 > 39.8386 )
								if( dn <= 51.8928 )
									ret := 0.166065
								if( dn > 51.8928 )
									ret := -0.844444 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator SuperTrend 
//@version=5
//indicator title="Supertrend", overlay=true, format=format.price, precision=2, timeframe="")

Periods = input.int(title="ATR Period", defval=10)
src = input.source(hl2, title="Source")
Multiplier = input.float(title="ATR Multiplier", step=0.1, defval=3.0)
changeATR = input.bool(title="Change ATR Calculation Method?", defval=true)
showsignals = input.bool(title="Show Buy/Sell Signals?", defval=true)
highlighting = input.bool(title="Highlighter On/Off?", defval=true)

atr2 = ta.sma(ta.tr, Periods)
atr = changeATR ? ta.atr(Periods) : atr2

up = src - (Multiplier * atr)
up1 = nz(up[1], up)
up := close[1] > up1 ? math.max(up, up1) : up

dn = src + (Multiplier * atr)
dn1 = nz(dn[1], dn)
dn := close[1] < dn1 ? math.min(dn, dn1) : dn

var trend = 1
trend := nz(trend[1], trend)
trend := trend == -1 and close > dn1 ? 1 : trend == 1 and close < up1 ? -1 : trend

upPlot = plot(trend == 1 ? up : na, title="Up Trend", style=plot.style_linebr, linewidth=2, color=color.green)
dnPlot = plot(trend == 1 ? na : dn, title="Down Trend", style=plot.style_linebr, linewidth=2, color=color.red)

buySignal = trend == 1 and trend[1] == -1
sellSignal = trend == -1 and trend[1] == 1

plotshape(buySignal, title="UpTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(sellSignal, title="DownTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.red, textcolor=color.white)

plotshape(showsignals and buySignal, title="Buy", text="Buy", location=location.absolute, style=shape.labelup, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(showsignals and sellSignal, title="Sell", text="Sell", location=location.absolute, style=shape.labeldown, size=size.tiny, color=color.red, textcolor=color.white)

mPlot = plot(ohlc4, title="", style=plot.style_circles, linewidth=1)

longFillColor = highlighting ? (trend == 1 ? color.new(color.green, 80) : color.new(color.white, 100)) : color.new(color.white, 100)
shortFillColor = highlighting ? (trend == -1 ? color.new(color.red, 80) : color.new(color.white, 100)) : color.new(color.white, 100)

fill(mPlot, upPlot, title="UpTrend Highlighter", color=longFillColor)
fill(mPlot, dnPlot, title="DownTrend Highlighter", color=shortFillColor)

alertcondition(buySignal, title="SuperTrend Buy", message="SuperTrend Buy!")
alertcondition(sellSignal, title="SuperTrend Sell", message="SuperTrend Sell!")
changeCond = trend != trend[1]
alertcondition(changeCond, title="SuperTrend Direction Change", message="SuperTrend has changed direction!")

buySignalInt = buySignal ? 1: 0   //Bool to int
sellSignalInt = sellSignal ? 1: 0   //Bool to int

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
float op_operation = decision_tree_0_LINKUSDT_30Min_0c6324a1(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


