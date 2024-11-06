//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: GOOG_1Min_1ADX_e06867a0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_1ADX_e06867a0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_e06867a0(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( directionalMovementMinus <= 0.000688 )
		if( trueRange <= 0.174034 )
			if( diPlus <= 48.7934 )
				if( smoothedDirectionalMovementMinus <= 0.103604 )
					if( diMinus <= 65.103 )
						if( smoothedTrueRange <= 0.259404 )
							if( adx <= 50.571 )
								if( smoothedDirectionalMovementPlus <= 0.029152 )
									ret := -0.031127
								if( smoothedDirectionalMovementPlus > 0.029152 )
									ret := 0.028150
							if( adx > 50.571 )
								if( diPlus <= 16.8993 )
									ret := 0.135965
								if( diPlus > 16.8993 )
									ret := 0.006081
						if( smoothedTrueRange > 0.259404 )
							if( diPlus <= 28.985 )
								if( dx <= 42.0269 )
									ret := -0.218750
								if( dx > 42.0269 )
									ret := -0.586667
							if( diPlus > 28.985 )
								if( diMinus <= 35.839 )
									ret := 0.051402
								if( diMinus > 35.839 )
									ret := -0.692308
					if( diMinus > 65.103 )
						if( smoothedTrueRange <= 0.117861 )
							if( smoothedTrueRange <= 0.078993 )
								if( trueRange <= 0.04112 )
									ret := 0.267380
								if( trueRange > 0.04112 )
									ret := -0.333333
							if( smoothedTrueRange > 0.078993 )
								if( dx <= 42.4098 )
									ret := -0.090909
								if( dx > 42.4098 )
									ret := 0.615894
						if( smoothedTrueRange > 0.117861 )
							if( adx <= 42.7833 )
								if( diPlus <= 25.0807 )
									ret := 0.214286
								if( diPlus > 25.0807 )
									ret := 0.642857
							if( adx > 42.7833 )
								if( diMinus <= 68.6875 )
									ret := -0.846154 // sell
								if( diMinus > 68.6875 )
									ret := -0.318182
				if( smoothedDirectionalMovementMinus > 0.103604 )
					if( diPlus <= 18.3696 )
						if( smoothedDirectionalMovementPlus <= 0.030753 )
							if( dx <= 62.8194 )
								ret := 0.666667
							if( dx > 62.8194 )
								if( adx <= 39.6812 )
									ret := 0.846154 // buy
								if( adx > 39.6812 )
									ret := 0.025000
						if( smoothedDirectionalMovementPlus > 0.030753 )
							if( adx <= 34.4695 )
								if( adx <= 27.3257 )
									ret := -0.538462
								if( adx > 27.3257 )
									ret := -1.000000 // sell
							if( adx > 34.4695 )
								if( diMinus <= 36.6563 )
									ret := 0.928571 // buy
								if( diMinus > 36.6563 )
									ret := -0.136364
					if( diPlus > 18.3696 )
						if( diMinus <= 56.9703 )
							if( smoothedDirectionalMovementMinus <= 0.115397 )
								if( adx <= 16.2441 )
									ret := 0.941176 // buy
								if( adx > 16.2441 )
									ret := 0.206897
							if( smoothedDirectionalMovementMinus > 0.115397 )
								if( diPlus <= 23.1399 )
									ret := 0.285714
								if( diPlus > 23.1399 )
									ret := -0.279412
						if( diMinus > 56.9703 )
							if( adx <= 46.3437 )
								if( dx <= 32.9586 )
									ret := 1.000000 // buy
								if( dx > 32.9586 )
									ret := 0.463768
							if( adx > 46.3437 )
								if( directionalMovementPlus <= 0.030466 )
									ret := 0.818182 // buy
								if( directionalMovementPlus > 0.030466 )
									ret := 1.000000 // buy
			if( diPlus > 48.7934 )
				if( adx <= 35.1712 )
					if( adx <= 22.6048 )
						if( adx <= 16.8615 )
							if( diMinus <= 32.005 )
								if( smoothedDirectionalMovementMinus <= 0.020711 )
									ret := -0.215909
								if( smoothedDirectionalMovementMinus > 0.020711 )
									ret := 0.568182
							if( diMinus > 32.005 )
								if( dx <= 28.232 )
									ret := -0.175908
								if( dx > 28.232 )
									ret := -0.697674
						if( adx > 16.8615 )
							if( diPlus <= 63.8449 )
								if( smoothedTrueRange <= 0.075641 )
									ret := -0.005935
								if( smoothedTrueRange > 0.075641 )
									ret := 0.237143
							if( diPlus > 63.8449 )
								if( dx <= 39.5988 )
									ret := -0.051282
								if( dx > 39.5988 )
									ret := -0.500000
					if( adx > 22.6048 )
						if( dx <= 84.3101 )
							if( smoothedTrueRange <= 0.181082 )
								if( diPlus <= 83.8046 )
									ret := -0.179207
								if( diPlus > 83.8046 )
									ret := -0.777778 // sell
							if( smoothedTrueRange > 0.181082 )
								if( smoothedDirectionalMovementMinus <= 0.03215 )
									ret := -1.000000 // sell
								if( smoothedDirectionalMovementMinus > 0.03215 )
									ret := -0.578125
						if( dx > 84.3101 )
							ret := 0.650000
				if( adx > 35.1712 )
					if( diMinus <= 43.3454 )
						if( diMinus <= 8.40761 )
							if( smoothedDirectionalMovementPlus <= 0.110393 )
								if( diPlus <= 90.1098 )
									ret := -0.276536
								if( diPlus > 90.1098 )
									ret := 0.846154 // buy
							if( smoothedDirectionalMovementPlus > 0.110393 )
								if( dx <= 87.0312 )
									ret := 0.111111
								if( dx > 87.0312 )
									ret := 0.333333
						if( diMinus > 8.40761 )
							if( smoothedDirectionalMovementMinus <= 0.051248 )
								if( smoothedDirectionalMovementMinus <= 0.04177 )
									ret := 0.084444
								if( smoothedDirectionalMovementMinus > 0.04177 )
									ret := -0.372093
							if( smoothedDirectionalMovementMinus > 0.051248 )
								if( diPlus <= 58.9873 )
									ret := 0.000000
								if( diPlus > 58.9873 )
									ret := 0.878788 // buy
					if( diMinus > 43.3454 )
						if( diMinus <= 44.1515 )
							if( smoothedDirectionalMovementMinus <= 0.037794 )
								ret := 0.818182 // buy
							if( smoothedDirectionalMovementMinus > 0.037794 )
								ret := 1.000000 // buy
						if( diMinus > 44.1515 )
							if( smoothedDirectionalMovementPlus <= 0.04686 )
								if( smoothedDirectionalMovementPlus <= 0.030712 )
									ret := 0.545455
								if( smoothedDirectionalMovementPlus > 0.030712 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementPlus > 0.04686 )
								ret := 0.125000
		if( trueRange > 0.174034 )
			if( adx <= 23.0673 )
				if( dx <= 56.1764 )
					if( smoothedDirectionalMovementMinus <= 0.113914 )
						if( adx <= 16.8627 )
							if( smoothedDirectionalMovementMinus <= 0.104947 )
								if( smoothedDirectionalMovementPlus <= 0.13217 )
									ret := -0.118728
								if( smoothedDirectionalMovementPlus > 0.13217 )
									ret := 0.500000
							if( smoothedDirectionalMovementMinus > 0.104947 )
								if( diMinus <= 28.9163 )
									ret := 0.500000
								if( diMinus > 28.9163 )
									ret := 0.818182 // buy
						if( adx > 16.8627 )
							if( dx <= 30.863 )
								if( diPlus <= 45.0488 )
									ret := 0.031079
								if( diPlus > 45.0488 )
									ret := -0.255556
							if( dx > 30.863 )
								if( directionalMovementPlus <= 0.000994 )
									ret := -0.382979
								if( directionalMovementPlus > 0.000994 )
									ret := 0.211744
					if( smoothedDirectionalMovementMinus > 0.113914 )
						if( smoothedDirectionalMovementPlus <= 0.236059 )
							if( trueRange <= 0.586241 )
								if( adx <= 15.2716 )
									ret := -0.690909
								if( adx > 15.2716 )
									ret := -0.112903
							if( trueRange > 0.586241 )
								ret := -1.000000 // sell
						if( smoothedDirectionalMovementPlus > 0.236059 )
							ret := 0.764706 // buy
				if( dx > 56.1764 )
					if( smoothedDirectionalMovementPlus <= 0.059726 )
						if( directionalMovementPlus <= 0.057888 )
							ret := -0.555556
						if( directionalMovementPlus > 0.057888 )
							if( diPlus <= 31.0024 )
								ret := 0.642857
							if( diPlus > 31.0024 )
								ret := -0.142857
					if( smoothedDirectionalMovementPlus > 0.059726 )
						if( dx <= 64.3494 )
							if( directionalMovementPlus <= 0.122019 )
								ret := -0.842105 // sell
							if( directionalMovementPlus > 0.122019 )
								ret := -1.000000 // sell
						if( dx > 64.3494 )
							if( adx <= 21.9968 )
								if( trueRange <= 0.292373 )
									ret := -0.333333
								if( trueRange > 0.292373 )
									ret := -0.739130 // sell
							if( adx > 21.9968 )
								ret := 0.875000 // buy
			if( adx > 23.0673 )
				if( smoothedDirectionalMovementPlus <= 0.047884 )
					if( diPlus <= 3.85045 )
						if( smoothedDirectionalMovementPlus <= 0.008358 )
							if( diMinus <= 40.1381 )
								ret := 0.384615
							if( diMinus > 40.1381 )
								if( smoothedTrueRange <= 0.22315 )
									ret := -0.555556
								if( smoothedTrueRange > 0.22315 )
									ret := -0.800000 // sell
						if( smoothedDirectionalMovementPlus > 0.008358 )
							if( smoothedDirectionalMovementPlus <= 0.017272 )
								if( dx <= 83.9057 )
									ret := -0.833333 // sell
								if( dx > 83.9057 )
									ret := -0.956522 // sell
							if( smoothedDirectionalMovementPlus > 0.017272 )
								ret := -0.555556
					if( diPlus > 3.85045 )
						if( diPlus <= 56.394 )
							if( dx <= 4.50915 )
								if( smoothedDirectionalMovementPlus <= 0.033867 )
									ret := 0.155172
								if( smoothedDirectionalMovementPlus > 0.033867 )
									ret := -0.429412
							if( dx > 4.50915 )
								if( smoothedDirectionalMovementMinus <= 0.085097 )
									ret := 0.018806
								if( smoothedDirectionalMovementMinus > 0.085097 )
									ret := -0.145251
						if( diPlus > 56.394 )
							if( adx <= 47.3578 )
								if( trueRange <= 0.18924 )
									ret := -1.000000 // sell
								if( trueRange > 0.18924 )
									ret := -0.769231 // sell
							if( adx > 47.3578 )
								ret := 0.600000
				if( smoothedDirectionalMovementPlus > 0.047884 )
					if( directionalMovementPlus <= 0.074047 )
						if( diMinus <= 1.68468 )
							if( smoothedDirectionalMovementPlus <= 0.098457 )
								if( directionalMovementPlus <= 0.045 )
									ret := -1.000000 // sell
								if( directionalMovementPlus > 0.045 )
									ret := -0.687500
							if( smoothedDirectionalMovementPlus > 0.098457 )
								if( diMinus <= 1.0769 )
									ret := 0.600000
								if( diMinus > 1.0769 )
									ret := -0.777778 // sell
						if( diMinus > 1.68468 )
							if( dx <= 77.5574 )
								if( diPlus <= 12.9198 )
									ret := -0.604167
								if( diPlus > 12.9198 )
									ret := -0.085870
							if( dx > 77.5574 )
								if( diPlus <= 43.2148 )
									ret := 0.078431
								if( diPlus > 43.2148 )
									ret := 0.734375 // buy
					if( directionalMovementPlus > 0.074047 )
						if( diPlus <= 47.2463 )
							if( dx <= 57.7203 )
								if( dx <= 6.37211 )
									ret := 0.027864
								if( dx > 6.37211 )
									ret := -0.271348
							if( dx > 57.7203 )
								if( adx <= 72.0749 )
									ret := 0.062264
								if( adx > 72.0749 )
									ret := -0.782609 // sell
						if( diPlus > 47.2463 )
							if( dx <= 97.0819 )
								if( smoothedTrueRange <= 0.44265 )
									ret := -0.373000
								if( smoothedTrueRange > 0.44265 )
									ret := 0.074074
							if( dx > 97.0819 )
								if( trueRange <= 0.220242 )
									ret := 0.789474 // buy
								if( trueRange > 0.220242 )
									ret := 0.533333
	if( directionalMovementMinus > 0.000688 )
		if( directionalMovementMinus <= 0.437144 )
			if( directionalMovementPlus <= 0.11595 )
				if( smoothedDirectionalMovementPlus <= 0.083181 )
					if( diMinus <= 44.3083 )
						if( dx <= 98.0963 )
							if( adx <= 92.4537 )
								if( diPlus <= 32.8729 )
									ret := 0.001937
								if( diPlus > 32.8729 )
									ret := 0.074833
							if( adx > 92.4537 )
								if( diMinus <= 37.7886 )
									ret := 0.875000 // buy
								if( diMinus > 37.7886 )
									ret := 1.000000 // buy
						if( dx > 98.0963 )
							if( dx <= 99.9919 )
								if( diMinus <= 37.1724 )
									ret := -0.700000 // sell
								if( diMinus > 37.1724 )
									ret := -0.950000 // sell
							if( dx > 99.9919 )
								if( directionalMovementMinus <= 0.03035 )
									ret := -0.833333 // sell
								if( directionalMovementMinus > 0.03035 )
									ret := -0.176471
					if( diMinus > 44.3083 )
						if( diPlus <= 17.0486 )
							if( trueRange <= 0.066323 )
								if( diMinus <= 54.0734 )
									ret := 0.104478
								if( diMinus > 54.0734 )
									ret := -0.278523
							if( trueRange > 0.066323 )
								if( adx <= 77.8909 )
									ret := 0.091511
								if( adx > 77.8909 )
									ret := -0.418605
						if( diPlus > 17.0486 )
							if( diMinus <= 46.3443 )
								if( diPlus <= 47.9431 )
									ret := 0.270089
								if( diPlus > 47.9431 )
									ret := 0.644295
							if( diMinus > 46.3443 )
								if( dx <= 23.6424 )
									ret := 0.052725
								if( dx > 23.6424 )
									ret := 0.205634
				if( smoothedDirectionalMovementPlus > 0.083181 )
					if( directionalMovementMinus <= 0.079221 )
						if( diPlus <= 14.8267 )
							ret := 1.000000 // buy
						if( diPlus > 14.8267 )
							if( adx <= 27.2549 )
								if( dx <= 42.4264 )
									ret := 0.036723
								if( dx > 42.4264 )
									ret := -0.471698
							if( adx > 27.2549 )
								if( dx <= 88.6077 )
									ret := -0.334206
								if( dx > 88.6077 )
									ret := 0.633333
					if( directionalMovementMinus > 0.079221 )
						if( smoothedDirectionalMovementPlus <= 0.223744 )
							if( dx <= 2.46183 )
								if( directionalMovementPlus <= 0.007936 )
									ret := -0.500000
								if( directionalMovementPlus > 0.007936 )
									ret := -0.800000 // sell
							if( dx > 2.46183 )
								if( diMinus <= 17.3108 )
									ret := -0.237525
								if( diMinus > 17.3108 )
									ret := 0.068182
						if( smoothedDirectionalMovementPlus > 0.223744 )
							if( diPlus <= 60.7282 )
								if( adx <= 54.0223 )
									ret := -0.627119
								if( adx > 54.0223 )
									ret := -1.000000 // sell
							if( diPlus > 60.7282 )
								ret := -0.066667
			if( directionalMovementPlus > 0.11595 )
				if( adx <= 12.0997 )
					if( adx <= 9.89572 )
						ret := -0.375000
					if( adx > 9.89572 )
						ret := -1.000000 // sell
				if( adx > 12.0997 )
					if( smoothedTrueRange <= 1.11909 )
						if( dx <= 25.1055 )
							if( smoothedDirectionalMovementMinus <= 0.20192 )
								if( smoothedDirectionalMovementMinus <= 0.042318 )
									ret := 0.064677
								if( smoothedDirectionalMovementMinus > 0.042318 )
									ret := -0.279588
							if( smoothedDirectionalMovementMinus > 0.20192 )
								ret := 1.000000 // buy
						if( dx > 25.1055 )
							if( dx <= 28.0617 )
								if( smoothedTrueRange <= 0.259636 )
									ret := 0.488889
								if( smoothedTrueRange > 0.259636 )
									ret := 0.941176 // buy
							if( dx > 28.0617 )
								if( smoothedTrueRange <= 0.083648 )
									ret := -0.818182 // sell
								if( smoothedTrueRange > 0.083648 )
									ret := -0.062323
					if( smoothedTrueRange > 1.11909 )
						if( smoothedTrueRange <= 1.64438 )
							ret := -0.529412
						if( smoothedTrueRange > 1.64438 )
							ret := -1.000000 // sell
		if( directionalMovementMinus > 0.437144 )
			if( diPlus <= 15.3858 )
				if( adx <= 22.4094 )
					if( trueRange <= 0.659977 )
						ret := -0.466667
					if( trueRange > 0.659977 )
						ret := -1.000000 // sell
				if( adx > 22.4094 )
					if( smoothedTrueRange <= 0.195886 )
						if( smoothedTrueRange <= 0.156433 )
							if( adx <= 40.1343 )
								if( directionalMovementMinus <= 0.794646 )
									ret := -0.555556
								if( directionalMovementMinus > 0.794646 )
									ret := 0.200000
							if( adx > 40.1343 )
								ret := 0.642857
						if( smoothedTrueRange > 0.156433 )
							if( dx <= 73.0127 )
								ret := -0.111111
							if( dx > 73.0127 )
								if( trueRange <= 0.76301 )
									ret := -0.846154 // sell
								if( trueRange > 0.76301 )
									ret := -0.700000 // sell
					if( smoothedTrueRange > 0.195886 )
						if( diPlus <= 5.62662 )
							if( dx <= 87.9548 )
								ret := 1.000000 // buy
							if( dx > 87.9548 )
								ret := 0.333333
						if( diPlus > 5.62662 )
							if( adx <= 37.113 )
								if( smoothedTrueRange <= 0.224857 )
									ret := 0.555556
								if( smoothedTrueRange > 0.224857 )
									ret := 1.000000 // buy
							if( adx > 37.113 )
								if( diMinus <= 42.2752 )
									ret := -1.000000 // sell
								if( diMinus > 42.2752 )
									ret := 0.309524
			if( diPlus > 15.3858 )
				if( diMinus <= 42.305 )
					if( diPlus <= 28.0901 )
						if( trueRange <= 1.12325 )
							if( smoothedDirectionalMovementPlus <= 0.079001 )
								if( dx <= 25.4342 )
									ret := -0.833333 // sell
								if( dx > 25.4342 )
									ret := -0.318182
							if( smoothedDirectionalMovementPlus > 0.079001 )
								if( smoothedDirectionalMovementPlus <= 0.128743 )
									ret := 0.318182
								if( smoothedDirectionalMovementPlus > 0.128743 )
									ret := -0.666667
						if( trueRange > 1.12325 )
							ret := 0.583333
					if( diPlus > 28.0901 )
						if( trueRange <= 0.784539 )
							if( diMinus <= 35.3167 )
								if( adx <= 41.4227 )
									ret := 0.305556
								if( adx > 41.4227 )
									ret := 0.696970
							if( diMinus > 35.3167 )
								ret := 1.000000 // buy
						if( trueRange > 0.784539 )
							if( diPlus <= 32.8961 )
								ret := 0.764706 // buy
							if( diPlus > 32.8961 )
								if( smoothedDirectionalMovementMinus <= 0.202143 )
									ret := -0.900000 // sell
								if( smoothedDirectionalMovementMinus > 0.202143 )
									ret := 0.363636
				if( diMinus > 42.305 )
					if( dx <= 65.1869 )
						if( adx <= 31.1105 )
							if( trueRange <= 0.560499 )
								if( diPlus <= 19.8211 )
									ret := 1.000000 // buy
								if( diPlus > 19.8211 )
									ret := 0.151515
							if( trueRange > 0.560499 )
								if( diPlus <= 18.0954 )
									ret := 1.000000 // buy
								if( diPlus > 18.0954 )
									ret := 0.730769 // buy
						if( adx > 31.1105 )
							if( dx <= 51.4712 )
								if( trueRange <= 0.616012 )
									ret := 0.833333 // buy
								if( trueRange > 0.616012 )
									ret := 0.265625
							if( dx > 51.4712 )
								ret := -0.411765
					if( dx > 65.1869 )
						ret := -0.166667
	
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
float op_operation = decision_tree_0_GOOG_1Min_e06867a0(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


