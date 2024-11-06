//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: SHOP_1Min_1ADX_a06157f5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SHOP_1Min_1ADX_a06157f5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SHOP_1Min_a06157f5(dx, diMinus, directionalMovementMinus, adx, diPlus, directionalMovementPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, trueRange)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( diMinus <= 48.5082 )
		if( smoothedDirectionalMovementMinus <= 0.029787 )
			if( dx <= 2.66662 )
				if( smoothedTrueRange <= 0.090275 )
					if( smoothedDirectionalMovementMinus <= 0.023977 )
						if( diPlus <= 47.1764 )
							if( diMinus <= 31.8567 )
								if( adx <= 20.7464 )
									ret := 0.087379
								if( adx > 20.7464 )
									ret := -0.047244
							if( diMinus > 31.8567 )
								if( diPlus <= 38.4864 )
									ret := 0.528926
								if( diPlus > 38.4864 )
									ret := 0.181818
						if( diPlus > 47.1764 )
							if( smoothedTrueRange <= 0.0397 )
								ret := -0.352941
							if( smoothedTrueRange > 0.0397 )
								ret := -0.882353 // sell
					if( smoothedDirectionalMovementMinus > 0.023977 )
						if( trueRange <= 0.086001 )
							if( diMinus <= 47.3737 )
								if( directionalMovementPlus <= 0.022253 )
									ret := -0.241379
								if( directionalMovementPlus > 0.022253 )
									ret := 0.333333
							if( diMinus > 47.3737 )
								ret := 1.000000 // buy
						if( trueRange > 0.086001 )
							if( directionalMovementPlus <= 0.052621 )
								if( diPlus <= 35.4822 )
									ret := -0.444444
								if( diPlus > 35.4822 )
									ret := 0.076923
							if( directionalMovementPlus > 0.052621 )
								if( smoothedDirectionalMovementPlus <= 0.02691 )
									ret := -0.928571 // sell
								if( smoothedDirectionalMovementPlus > 0.02691 )
									ret := -0.642857
				if( smoothedTrueRange > 0.090275 )
					if( dx <= 2.36293 )
						if( diPlus <= 28.1682 )
							if( adx <= 22.362 )
								if( trueRange <= 0.061684 )
									ret := 0.051282
								if( trueRange > 0.061684 )
									ret := 0.536496
							if( adx > 22.362 )
								if( smoothedTrueRange <= 0.095471 )
									ret := 0.688889
								if( smoothedTrueRange > 0.095471 )
									ret := 0.011070
						if( diPlus > 28.1682 )
							if( smoothedDirectionalMovementPlus <= 0.028339 )
								ret := -0.090909
							if( smoothedDirectionalMovementPlus > 0.028339 )
								ret := -0.571429
					if( dx > 2.36293 )
						if( trueRange <= 0.095018 )
							if( dx <= 2.51791 )
								ret := 0.133333
							if( dx > 2.51791 )
								ret := 0.722222 // buy
						if( trueRange > 0.095018 )
							if( dx <= 2.5687 )
								ret := 1.000000 // buy
							if( dx > 2.5687 )
								ret := 0.777778 // buy
			if( dx > 2.66662 )
				if( trueRange <= 0.180268 )
					if( directionalMovementMinus <= 0.122206 )
						if( smoothedDirectionalMovementPlus <= 0.036052 )
							if( adx <= 36.4089 )
								if( diMinus <= 43.9212 )
									ret := -0.020662
								if( diMinus > 43.9212 )
									ret := 0.132450
							if( adx > 36.4089 )
								if( smoothedDirectionalMovementPlus <= 0.012888 )
									ret := -0.010669
								if( smoothedDirectionalMovementPlus > 0.012888 )
									ret := 0.068658
						if( smoothedDirectionalMovementPlus > 0.036052 )
							if( dx <= 25.0764 )
								if( diPlus <= 22.5559 )
									ret := -0.888889 // sell
								if( diPlus > 22.5559 )
									ret := -0.221898
							if( dx > 25.0764 )
								if( adx <= 44.0965 )
									ret := 0.002857
								if( adx > 44.0965 )
									ret := -0.155714
					if( directionalMovementMinus > 0.122206 )
						if( directionalMovementMinus <= 0.124318 )
							if( diMinus <= 26.1035 )
								ret := 0.357143
							if( diMinus > 26.1035 )
								ret := 0.916667 // buy
						if( directionalMovementMinus > 0.124318 )
							if( smoothedDirectionalMovementPlus <= 0.039598 )
								if( adx <= 21.5712 )
									ret := 0.493151
								if( adx > 21.5712 )
									ret := 0.024876
							if( smoothedDirectionalMovementPlus > 0.039598 )
								if( smoothedDirectionalMovementPlus <= 0.060011 )
									ret := 0.457143
								if( smoothedDirectionalMovementPlus > 0.060011 )
									ret := 0.814815 // buy
				if( trueRange > 0.180268 )
					if( dx <= 58.4706 )
						if( directionalMovementPlus <= 0.000275 )
							if( diPlus <= 31.1953 )
								if( diPlus <= 19.683 )
									ret := -0.200000
								if( diPlus > 19.683 )
									ret := 0.357143
							if( diPlus > 31.1953 )
								if( adx <= 33.6843 )
									ret := 0.078125
								if( adx > 33.6843 )
									ret := -0.441667
						if( directionalMovementPlus > 0.000275 )
							if( diMinus <= 41.1646 )
								if( adx <= 12.7265 )
									ret := 0.421053
								if( adx > 12.7265 )
									ret := -0.288618
							if( diMinus > 41.1646 )
								if( diPlus <= 55.4958 )
									ret := -1.000000 // sell
								if( diPlus > 55.4958 )
									ret := -0.625000
					if( dx > 58.4706 )
						if( diPlus <= 50.0425 )
							if( diMinus <= 4.95002 )
								if( diMinus <= 3.54221 )
									ret := -0.023256
								if( diMinus > 3.54221 )
									ret := 0.920000 // buy
							if( diMinus > 4.95002 )
								if( smoothedDirectionalMovementMinus <= 0.012744 )
									ret := -0.654412
								if( smoothedDirectionalMovementMinus > 0.012744 )
									ret := 0.102041
						if( diPlus > 50.0425 )
							if( diPlus <= 75.3146 )
								if( adx <= 92.7834 )
									ret := 0.539906
								if( adx > 92.7834 )
									ret := -1.000000 // sell
							if( diPlus > 75.3146 )
								if( directionalMovementMinus <= 0.000284 )
									ret := -0.337500
								if( directionalMovementMinus > 0.000284 )
									ret := 1.000000 // buy
		if( smoothedDirectionalMovementMinus > 0.029787 )
			if( directionalMovementMinus <= 0.095474 )
				if( diPlus <= 50.6442 )
					if( directionalMovementPlus <= 0.042569 )
						if( diPlus <= 8.53027 )
							if( dx <= 86.2897 )
								if( smoothedTrueRange <= 0.128844 )
									ret := -0.118343
								if( smoothedTrueRange > 0.128844 )
									ret := -0.385886
							if( dx > 86.2897 )
								if( smoothedDirectionalMovementPlus <= 0.003433 )
									ret := 0.180258
								if( smoothedDirectionalMovementPlus > 0.003433 )
									ret := -0.388889
						if( diPlus > 8.53027 )
							if( adx <= 65.0768 )
								if( diMinus <= 43.6225 )
									ret := -0.019226
								if( diMinus > 43.6225 )
									ret := 0.139848
							if( adx > 65.0768 )
								if( diMinus <= 41.855 )
									ret := 0.589109
								if( diMinus > 41.855 )
									ret := -0.021277
					if( directionalMovementPlus > 0.042569 )
						if( adx <= 9.80896 )
							if( trueRange <= 0.152608 )
								if( diPlus <= 46.9957 )
									ret := -0.361111
								if( diPlus > 46.9957 )
									ret := 0.900000 // buy
							if( trueRange > 0.152608 )
								if( smoothedDirectionalMovementPlus <= 0.078125 )
									ret := 0.857143 // buy
								if( smoothedDirectionalMovementPlus > 0.078125 )
									ret := 0.333333
						if( adx > 9.80896 )
							if( diPlus <= 25.1266 )
								if( smoothedTrueRange <= 0.132036 )
									ret := 0.018277
								if( smoothedTrueRange > 0.132036 )
									ret := -0.204696
							if( diPlus > 25.1266 )
								if( dx <= 40.415 )
									ret := -0.263006
								if( dx > 40.415 )
									ret := -0.746988 // sell
				if( diPlus > 50.6442 )
					if( diPlus <= 71.4941 )
						if( directionalMovementPlus <= 0.045676 )
							if( adx <= 48.0407 )
								if( diMinus <= 29.8219 )
									ret := -0.688406
								if( diMinus > 29.8219 )
									ret := 0.055288
							if( adx > 48.0407 )
								if( smoothedTrueRange <= 0.144143 )
									ret := 0.315789
								if( smoothedTrueRange > 0.144143 )
									ret := 0.952381 // buy
						if( directionalMovementPlus > 0.045676 )
							if( directionalMovementMinus <= 0.000504 )
								if( directionalMovementPlus <= 0.104295 )
									ret := -0.314607
								if( directionalMovementPlus > 0.104295 )
									ret := -0.578261
							if( directionalMovementMinus > 0.000504 )
								if( diMinus <= 44.2208 )
									ret := -0.326087
								if( diMinus > 44.2208 )
									ret := 0.666667
					if( diPlus > 71.4941 )
						if( diMinus <= 2.44242 )
							ret := -0.850000 // sell
						if( diMinus > 2.44242 )
							if( dx <= 82.5832 )
								if( adx <= 51.4278 )
									ret := 0.552632
								if( adx > 51.4278 )
									ret := -0.428571
							if( dx > 82.5832 )
								ret := -0.100000
			if( directionalMovementMinus > 0.095474 )
				if( directionalMovementMinus <= 0.373118 )
					if( diMinus <= 44.4546 )
						if( dx <= 1.04122 )
							if( trueRange <= 0.195199 )
								ret := 0.000000
							if( trueRange > 0.195199 )
								if( directionalMovementPlus <= 0.000907 )
									ret := 0.875000 // buy
								if( directionalMovementPlus > 0.000907 )
									ret := 1.000000 // buy
						if( dx > 1.04122 )
							if( dx <= 7.37052 )
								if( smoothedDirectionalMovementPlus <= 0.033541 )
									ret := 0.266667
								if( smoothedDirectionalMovementPlus > 0.033541 )
									ret := -0.231788
							if( dx > 7.37052 )
								if( smoothedTrueRange <= 0.36534 )
									ret := 0.061490
								if( smoothedTrueRange > 0.36534 )
									ret := 0.540541
					if( diMinus > 44.4546 )
						if( diPlus <= 35.0621 )
							if( smoothedTrueRange <= 0.081608 )
								if( adx <= 22.4044 )
									ret := 0.444444
								if( adx > 22.4044 )
									ret := -0.206897
							if( smoothedTrueRange > 0.081608 )
								if( dx <= 39.9417 )
									ret := 0.722772 // buy
								if( dx > 39.9417 )
									ret := 0.480916
						if( diPlus > 35.0621 )
							if( smoothedTrueRange <= 0.138085 )
								if( trueRange <= 0.135695 )
									ret := 0.478261
								if( trueRange > 0.135695 )
									ret := -0.288462
							if( smoothedTrueRange > 0.138085 )
								if( dx <= 10.7832 )
									ret := -0.266667
								if( dx > 10.7832 )
									ret := -1.000000 // sell
				if( directionalMovementMinus > 0.373118 )
					if( diMinus <= 18.2683 )
						ret := -0.933333 // sell
					if( diMinus > 18.2683 )
						if( diMinus <= 44.7747 )
							if( smoothedTrueRange <= 0.580937 )
								if( smoothedDirectionalMovementPlus <= 0.037389 )
									ret := 0.473684
								if( smoothedDirectionalMovementPlus > 0.037389 )
									ret := 0.843750 // buy
							if( smoothedTrueRange > 0.580937 )
								ret := 0.111111
						if( diMinus > 44.7747 )
							ret := 0.090909
	if( diMinus > 48.5082 )
		if( directionalMovementMinus <= 0.078432 )
			if( diPlus <= 33.6726 )
				if( adx <= 83.1866 )
					if( dx <= 74.6632 )
						if( diMinus <= 68.7837 )
							if( dx <= 66.8186 )
								if( trueRange <= 0.018482 )
									ret := 0.157895
								if( trueRange > 0.018482 )
									ret := -0.061644
							if( dx > 66.8186 )
								if( directionalMovementPlus <= 6.7e-05 )
									ret := 0.300000
								if( directionalMovementPlus > 6.7e-05 )
									ret := 0.600000
						if( diMinus > 68.7837 )
							if( trueRange <= 0.023178 )
								if( diMinus <= 72.0879 )
									ret := 0.375000
								if( diMinus > 72.0879 )
									ret := -0.208791
							if( trueRange > 0.023178 )
								if( diPlus <= 28.0662 )
									ret := 0.602339
								if( diPlus > 28.0662 )
									ret := 0.052632
					if( dx > 74.6632 )
						if( dx <= 85.5338 )
							if( directionalMovementMinus <= 0.018841 )
								if( smoothedDirectionalMovementMinus <= 0.114763 )
									ret := -0.427419
								if( smoothedDirectionalMovementMinus > 0.114763 )
									ret := 0.238095
							if( directionalMovementMinus > 0.018841 )
								if( smoothedDirectionalMovementMinus <= 0.120627 )
									ret := 0.063492
								if( smoothedDirectionalMovementMinus > 0.120627 )
									ret := -0.928571 // sell
						if( dx > 85.5338 )
							if( smoothedTrueRange <= 0.093744 )
								if( smoothedDirectionalMovementPlus <= 0.001444 )
									ret := 0.077670
								if( smoothedDirectionalMovementPlus > 0.001444 )
									ret := -0.413333
							if( smoothedTrueRange > 0.093744 )
								if( diPlus <= 0.667763 )
									ret := -0.857143 // sell
								if( diPlus > 0.667763 )
									ret := 0.526316
				if( adx > 83.1866 )
					if( trueRange <= 0.085059 )
						if( adx <= 89.0896 )
							ret := 0.611111
						if( adx > 89.0896 )
							ret := 0.357143
					if( trueRange > 0.085059 )
						ret := 1.000000 // buy
			if( diPlus > 33.6726 )
				if( smoothedDirectionalMovementMinus <= 0.035758 )
					if( smoothedTrueRange <= 0.034607 )
						if( dx <= 0.680289 )
							if( adx <= 27.8683 )
								if( smoothedDirectionalMovementPlus <= 0.010165 )
									ret := 0.214286
								if( smoothedDirectionalMovementPlus > 0.010165 )
									ret := 0.794118 // buy
							if( adx > 27.8683 )
								ret := -0.142857
						if( dx > 0.680289 )
							if( smoothedDirectionalMovementMinus <= 0.020036 )
								if( diPlus <= 43.3632 )
									ret := -0.021459
								if( diPlus > 43.3632 )
									ret := -0.320312
							if( smoothedDirectionalMovementMinus > 0.020036 )
								ret := -0.785714 // sell
					if( smoothedTrueRange > 0.034607 )
						if( trueRange <= 0.168277 )
							if( trueRange <= 0.022375 )
								if( diMinus <= 62.5565 )
									ret := 0.013652
								if( diMinus > 62.5565 )
									ret := 0.631579
							if( trueRange > 0.022375 )
								if( smoothedDirectionalMovementMinus <= 0.035239 )
									ret := 0.311609
								if( smoothedDirectionalMovementMinus > 0.035239 )
									ret := -0.565217
						if( trueRange > 0.168277 )
							if( trueRange <= 0.197259 )
								ret := -0.888889 // sell
							if( trueRange > 0.197259 )
								ret := -1.000000 // sell
				if( smoothedDirectionalMovementMinus > 0.035758 )
					if( trueRange <= 0.119702 )
						if( smoothedDirectionalMovementMinus <= 0.1154 )
							if( diMinus <= 58.8953 )
								if( adx <= 22.198 )
									ret := 0.391011
								if( adx > 22.198 )
									ret := 0.669118
							if( diMinus > 58.8953 )
								if( diPlus <= 36.8166 )
									ret := -0.295775
								if( diPlus > 36.8166 )
									ret := 0.730159 // buy
						if( smoothedDirectionalMovementMinus > 0.1154 )
							ret := -0.545455
					if( trueRange > 0.119702 )
						if( adx <= 17.6078 )
							if( smoothedDirectionalMovementMinus <= 0.052552 )
								if( smoothedDirectionalMovementMinus <= 0.04078 )
									ret := 0.076923
								if( smoothedDirectionalMovementMinus > 0.04078 )
									ret := 0.434783
							if( smoothedDirectionalMovementMinus > 0.052552 )
								if( smoothedDirectionalMovementPlus <= 0.067871 )
									ret := 1.000000 // buy
								if( smoothedDirectionalMovementPlus > 0.067871 )
									ret := 0.833333 // buy
						if( adx > 17.6078 )
							if( dx <= 14.8244 )
								if( smoothedTrueRange <= 0.093071 )
									ret := 0.166667
								if( smoothedTrueRange > 0.093071 )
									ret := 0.555556
							if( dx > 14.8244 )
								if( smoothedTrueRange <= 0.155726 )
									ret := -0.235294
								if( smoothedTrueRange > 0.155726 )
									ret := -0.833333 // sell
		if( directionalMovementMinus > 0.078432 )
			if( smoothedDirectionalMovementPlus <= 0.037176 )
				if( diPlus <= 0.829848 )
					if( diPlus <= 0.480674 )
						ret := -0.363636
					if( diPlus > 0.480674 )
						ret := -0.928571 // sell
				if( diPlus > 0.829848 )
					if( smoothedTrueRange <= 0.075181 )
						if( smoothedDirectionalMovementMinus <= 0.037289 )
							if( diPlus <= 32.3028 )
								if( smoothedDirectionalMovementMinus <= 0.030007 )
									ret := 0.031250
								if( smoothedDirectionalMovementMinus > 0.030007 )
									ret := 0.305195
							if( diPlus > 32.3028 )
								if( diMinus <= 54.8459 )
									ret := 0.225166
								if( diMinus > 54.8459 )
									ret := 0.708029 // buy
						if( smoothedDirectionalMovementMinus > 0.037289 )
							if( smoothedDirectionalMovementMinus <= 0.048248 )
								if( directionalMovementPlus <= 0.006784 )
									ret := 0.752809 // buy
								if( directionalMovementPlus > 0.006784 )
									ret := 0.200000
							if( smoothedDirectionalMovementMinus > 0.048248 )
								if( trueRange <= 0.341758 )
									ret := 0.434783
								if( trueRange > 0.341758 )
									ret := -0.384615
					if( smoothedTrueRange > 0.075181 )
						if( directionalMovementMinus <= 0.78948 )
							if( adx <= 64.394 )
								if( trueRange <= 0.092527 )
									ret := 0.638889
								if( trueRange > 0.092527 )
									ret := 0.067742
							if( adx > 64.394 )
								if( directionalMovementMinus <= 0.095268 )
									ret := 0.142857
								if( directionalMovementMinus > 0.095268 )
									ret := 0.779412 // buy
						if( directionalMovementMinus > 0.78948 )
							ret := 1.000000 // buy
			if( smoothedDirectionalMovementPlus > 0.037176 )
				if( adx <= 12.6336 )
					if( diPlus <= 44.7075 )
						if( diMinus <= 51.056 )
							ret := 0.461538
						if( diMinus > 51.056 )
							if( trueRange <= 0.150205 )
								if( diPlus <= 40.6024 )
									ret := 0.625000
								if( diPlus > 40.6024 )
									ret := 0.958333 // buy
							if( trueRange > 0.150205 )
								ret := 1.000000 // buy
					if( diPlus > 44.7075 )
						ret := 0.411765
				if( adx > 12.6336 )
					if( diPlus <= 28.3968 )
						if( directionalMovementMinus <= 0.098104 )
							ret := 0.000000
						if( directionalMovementMinus > 0.098104 )
							if( dx <= 38.3984 )
								if( adx <= 23.1248 )
									ret := 1.000000 // buy
								if( adx > 23.1248 )
									ret := 0.222222
							if( dx > 38.3984 )
								if( adx <= 39.6797 )
									ret := 0.722222 // buy
								if( adx > 39.6797 )
									ret := 1.000000 // buy
					if( diPlus > 28.3968 )
						if( trueRange <= 0.299782 )
							if( dx <= 2.45711 )
								ret := -0.153846
							if( dx > 2.45711 )
								if( directionalMovementPlus <= 0.03346 )
									ret := 0.593607
								if( directionalMovementPlus > 0.03346 )
									ret := 0.000000
						if( trueRange > 0.299782 )
							if( adx <= 26.6863 )
								if( diPlus <= 31.6459 )
									ret := 1.000000 // buy
								if( diPlus > 31.6459 )
									ret := -0.022727
							if( adx > 26.6863 )
								if( smoothedTrueRange <= 0.164742 )
									ret := -0.760000 // sell
								if( smoothedTrueRange > 0.164742 )
									ret := 0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

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
float op_operation = decision_tree_0_SHOP_1Min_a06157f5(dx, diMinus, directionalMovementMinus, adx, diPlus, directionalMovementPlus, smoothedTrueRange, smoothedDirectionalMovementPlus, smoothedDirectionalMovementMinus, trueRange)

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


