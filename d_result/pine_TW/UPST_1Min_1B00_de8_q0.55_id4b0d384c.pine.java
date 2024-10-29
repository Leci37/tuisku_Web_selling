//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power
// ID_model: UPST_1Min_1B00_4b0d384c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1B00_4b0d384c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_4b0d384c(bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.056367 )
		if( bearPower <= -0.520858 )
			if( bbm <= 0.14645 )
				if( bbp <= -1.18747 )
					if( bullPower <= -0.880021 )
						ret := -0.750000 // sell
					if( bullPower > -0.880021 )
						if( bearPower <= -0.851011 )
							if( bbp <= -1.7646 )
								ret := 1.000000 // buy
							if( bbp > -1.7646 )
								ret := 0.250000
						if( bearPower > -0.851011 )
							ret := 1.000000 // buy
				if( bbp > -1.18747 )
					if( bullPower <= -0.409808 )
						ret := -1.000000 // sell
					if( bullPower > -0.409808 )
						if( bbp <= -0.929565 )
							ret := 1.000000 // buy
						if( bbp > -0.929565 )
							ret := -0.250000
			if( bbm > 0.14645 )
				if( bbp <= -0.332779 )
					if( bbm <= 0.20985 )
						if( bearPower <= -0.535298 )
							if( bullPower <= -0.421364 )
								if( bullPower <= -0.445734 )
									ret := 0.833333 // buy
								if( bullPower > -0.445734 )
									ret := -0.250000
							if( bullPower > -0.421364 )
								if( bearPower <= -0.541211 )
									ret := 1.000000 // buy
								if( bearPower > -0.541211 )
									ret := 0.666667
						if( bearPower > -0.535298 )
							if( bullPower <= -0.336777 )
								ret := -0.250000
							if( bullPower > -0.336777 )
								ret := 0.714286 // buy
					if( bbm > 0.20985 )
						if( bullPower <= -0.383685 )
							if( bearPower <= -1.58157 )
								if( bearPower <= -2.17043 )
									ret := 0.882353 // buy
								if( bearPower > -2.17043 )
									ret := -0.200000
							if( bearPower > -1.58157 )
								if( bbm <= 0.230506 )
									ret := 0.142857
								if( bbm > 0.230506 )
									ret := 0.867647 // buy
						if( bullPower > -0.383685 )
							if( bbp <= -1.02096 )
								if( bearPower <= -1.01854 )
									ret := 0.375000
								if( bearPower > -1.01854 )
									ret := -0.568182
							if( bbp > -1.02096 )
								if( bearPower <= -0.657357 )
									ret := 0.857143 // buy
								if( bearPower > -0.657357 )
									ret := 0.391304
				if( bbp > -0.332779 )
					if( bearPower <= -0.613023 )
						ret := -1.000000 // sell
					if( bearPower > -0.613023 )
						ret := 1.000000 // buy
		if( bearPower > -0.520858 )
			if( bearPower <= -0.152845 )
				if( bbm <= 0.167599 )
					if( bbm <= 5e-05 )
						if( bullPower <= -0.167787 )
							if( bullPower <= -0.17172 )
								if( bearPower <= -0.236137 )
									ret := 0.515873
								if( bearPower > -0.236137 )
									ret := 0.208791
							if( bullPower > -0.17172 )
								if( bullPower <= -0.169142 )
									ret := 1.000000 // buy
								if( bullPower > -0.169142 )
									ret := 0.555556
						if( bullPower > -0.167787 )
							if( bullPower <= -0.162954 )
								if( bullPower <= -0.164038 )
									ret := -0.818182 // sell
								if( bullPower > -0.164038 )
									ret := -0.333333
							if( bullPower > -0.162954 )
								if( bullPower <= -0.154906 )
									ret := 0.564103
								if( bullPower > -0.154906 )
									ret := 0.111111
					if( bbm > 5e-05 )
						if( bullPower <= -0.043989 )
							if( bullPower <= -0.263952 )
								if( bullPower <= -0.442197 )
									ret := 1.000000 // buy
								if( bullPower > -0.442197 )
									ret := -0.369403
							if( bullPower > -0.263952 )
								if( bullPower <= -0.237316 )
									ret := 0.352273
								if( bullPower > -0.237316 )
									ret := 0.016290
						if( bullPower > -0.043989 )
							if( bullPower <= -0.035101 )
								if( bbp <= -0.201567 )
									ret := -0.720000 // sell
								if( bbp > -0.201567 )
									ret := -0.200000
							if( bullPower > -0.035101 )
								if( bullPower <= -0.030377 )
									ret := 0.320988
								if( bullPower > -0.030377 )
									ret := -0.174757
				if( bbm > 0.167599 )
					if( bullPower <= 0.087439 )
						if( bbm <= 0.189167 )
							if( bbm <= 0.170024 )
								if( bearPower <= -0.211488 )
									ret := 0.286667
								if( bearPower > -0.211488 )
									ret := -0.172414
							if( bbm > 0.170024 )
								if( bullPower <= -0.034007 )
									ret := 0.186120
								if( bullPower > -0.034007 )
									ret := 0.534091
						if( bbm > 0.189167 )
							if( bbm <= 0.197935 )
								if( bbp <= -0.693131 )
									ret := 0.411765
								if( bbp > -0.693131 )
									ret := -0.210526
							if( bbm > 0.197935 )
								if( bearPower <= -0.48648 )
									ret := 0.434783
								if( bearPower > -0.48648 )
									ret := 0.093700
					if( bullPower > 0.087439 )
						if( bullPower <= 0.11959 )
							if( bbm <= 0.26995 )
								if( bearPower <= -0.15548 )
									ret := -0.750000 // sell
								if( bearPower > -0.15548 )
									ret := 1.000000 // buy
							if( bbm > 0.26995 )
								if( bbp <= -0.277296 )
									ret := 0.105263
								if( bbp > -0.277296 )
									ret := 0.631148
						if( bullPower > 0.11959 )
							if( bbp <= -0.066687 )
								if( bbp <= -0.103331 )
									ret := 0.060606
								if( bbp > -0.103331 )
									ret := 0.479167
							if( bbp > -0.066687 )
								if( bearPower <= -0.201389 )
									ret := 0.000000
								if( bearPower > -0.201389 )
									ret := -1.000000 // sell
			if( bearPower > -0.152845 )
				if( bullPower <= -0.045032 )
					if( bbm <= 0.009946 )
						if( bearPower <= -0.088677 )
							if( bbp <= -0.266099 )
								if( bearPower <= -0.149884 )
									ret := -0.090909
								if( bearPower > -0.149884 )
									ret := 0.681250
							if( bbp > -0.266099 )
								if( bbp <= -0.260611 )
									ret := -0.225806
								if( bbp > -0.260611 )
									ret := 0.456115
						if( bearPower > -0.088677 )
							if( bbp <= -0.170165 )
								if( bbp <= -0.171061 )
									ret := 0.237500
								if( bbp > -0.171061 )
									ret := -0.470588
							if( bbp > -0.170165 )
								if( bearPower <= -0.082367 )
									ret := 0.610526
								if( bearPower > -0.082367 )
									ret := 0.300442
					if( bbm > 0.009946 )
						if( bullPower <= -0.132811 )
							if( bullPower <= -0.135521 )
								if( bbp <= -0.292273 )
									ret := 0.750000 // buy
								if( bbp > -0.292273 )
									ret := 0.500000
							if( bullPower > -0.135521 )
								ret := 1.000000 // buy
						if( bullPower > -0.132811 )
							if( bbm <= 0.099962 )
								if( bbm <= 0.09001 )
									ret := 0.102011
								if( bbm > 0.09001 )
									ret := -0.533333
							if( bbm > 0.099962 )
								if( bullPower <= -0.050989 )
									ret := 0.923077 // buy
								if( bullPower > -0.050989 )
									ret := 0.633333
				if( bullPower > -0.045032 )
					if( bbm <= 0.009375 )
						if( bullPower <= -0.036596 )
							if( bullPower <= -0.040853 )
								if( bbp <= -0.086196 )
									ret := 0.352000
								if( bbp > -0.086196 )
									ret := 0.088496
							if( bullPower > -0.040853 )
								if( bullPower <= -0.040614 )
									ret := 0.892857 // buy
								if( bullPower > -0.040614 )
									ret := 0.371308
						if( bullPower > -0.036596 )
							if( bearPower <= -0.034582 )
								if( bbp <= -0.069744 )
									ret := -0.063830
								if( bbp > -0.069744 )
									ret := -0.235294
							if( bearPower > -0.034582 )
								if( bullPower <= -0.033715 )
									ret := 0.390805
								if( bullPower > -0.033715 )
									ret := 0.126866
					if( bbm > 0.009375 )
						if( bullPower <= 0.010517 )
							if( bullPower <= 0.010022 )
								if( bbm <= 0.049951 )
									ret := -0.014459
								if( bbm > 0.049951 )
									ret := 0.045279
							if( bullPower > 0.010022 )
								if( bbp <= -0.074442 )
									ret := 0.000000
								if( bbp > -0.074442 )
									ret := -0.621622
						if( bullPower > 0.010517 )
							if( bbm <= 0.230303 )
								if( bullPower <= 0.033151 )
									ret := 0.216129
								if( bullPower > 0.033151 )
									ret := 0.030435
							if( bbm > 0.230303 )
								ret := 1.000000 // buy
	if( bbp > -0.056367 )
		if( bearPower <= 0.027585 )
			if( bearPower <= -0.039347 )
				if( bbp <= 0.00851 )
					if( bearPower <= -0.048171 )
						if( bbm <= 0.353672 )
							if( bearPower <= -0.140773 )
								if( bbm <= 0.25975 )
									ret := -0.928571 // sell
								if( bbm > 0.25975 )
									ret := -0.193878
							if( bearPower > -0.140773 )
								if( bbm <= 0.21882 )
									ret := -0.012889
								if( bbm > 0.21882 )
									ret := 0.310680
						if( bbm > 0.353672 )
							if( bearPower <= -0.196276 )
								if( bullPower <= 0.166621 )
									ret := -0.200000
								if( bullPower > 0.166621 )
									ret := 0.576923
							if( bearPower > -0.196276 )
								ret := 1.000000 // buy
					if( bearPower > -0.048171 )
						if( bullPower <= 0.049199 )
							if( bearPower <= -0.039694 )
								if( bbp <= -0.043061 )
									ret := -0.020513
								if( bbp > -0.043061 )
									ret := -0.157518
							if( bearPower > -0.039694 )
								if( bbm <= 0.069976 )
									ret := -0.434783
								if( bbm > 0.069976 )
									ret := 0.500000
						if( bullPower > 0.049199 )
							if( bbp <= 0.006585 )
								ret := -1.000000 // sell
							if( bbp > 0.006585 )
								if( bearPower <= -0.043192 )
									ret := -0.600000
								if( bearPower > -0.043192 )
									ret := -1.000000 // sell
				if( bbp > 0.00851 )
					if( bbp <= 0.198213 )
						if( bbm <= 0.120668 )
							if( bbp <= 0.014786 )
								if( bbp <= 0.012212 )
									ret := 0.072464
								if( bbp > 0.012212 )
									ret := -0.296296
							if( bbp > 0.014786 )
								if( bbp <= 0.033989 )
									ret := 0.537234
								if( bbp > 0.033989 )
									ret := -0.090909
						if( bbm > 0.120668 )
							if( bbm <= 0.128795 )
								if( bbm <= 0.124381 )
									ret := -1.000000 // sell
								if( bbm > 0.124381 )
									ret := -0.666667
							if( bbm > 0.128795 )
								if( bullPower <= 0.104341 )
									ret := 0.015686
								if( bullPower > 0.104341 )
									ret := 0.161947
					if( bbp > 0.198213 )
						if( bullPower <= 0.291992 )
							if( bearPower <= -0.049329 )
								ret := -1.000000 // sell
							if( bearPower > -0.049329 )
								if( bbp <= 0.213062 )
									ret := 0.000000
								if( bbp > 0.213062 )
									ret := -0.666667
						if( bullPower > 0.291992 )
							if( bearPower <= -0.070372 )
								if( bullPower <= 0.491995 )
									ret := -0.254902
								if( bullPower > 0.491995 )
									ret := -0.923077 // sell
							if( bearPower > -0.070372 )
								if( bbp <= 0.269993 )
									ret := 0.947368 // buy
								if( bbp > 0.269993 )
									ret := -0.090909
			if( bearPower > -0.039347 )
				if( bbp <= 0.387923 )
					if( bbm <= 0.179965 )
						if( bullPower <= 0.174147 )
							if( bbm <= 0.152088 )
								if( bbp <= 0.162569 )
									ret := 0.054634
								if( bbp > 0.162569 )
									ret := -0.291892
							if( bbm > 0.152088 )
								if( bullPower <= 0.160556 )
									ret := 0.174528
								if( bullPower > 0.160556 )
									ret := 0.614458
						if( bullPower > 0.174147 )
							if( bullPower <= 0.179251 )
								if( bearPower <= 0.01903 )
									ret := 0.789474 // buy
								if( bearPower > 0.01903 )
									ret := 0.966667 // buy
							if( bullPower > 0.179251 )
								if( bbm <= 0.161468 )
									ret := -0.187500
								if( bbm > 0.161468 )
									ret := 0.412698
					if( bbm > 0.179965 )
						if( bbm <= 0.240342 )
							if( bbp <= 0.215952 )
								if( bullPower <= 0.184422 )
									ret := -0.362416
								if( bullPower > 0.184422 )
									ret := 0.066667
							if( bbp > 0.215952 )
								if( bearPower <= 0.024261 )
									ret := -0.523438
								if( bearPower > 0.024261 )
									ret := 0.312500
						if( bbm > 0.240342 )
							if( bbp <= 0.30555 )
								if( bbp <= 0.266748 )
									ret := 0.516129
								if( bbp > 0.266748 )
									ret := 0.200000
							if( bbp > 0.30555 )
								if( bbp <= 0.354073 )
									ret := -0.524590
								if( bbp > 0.354073 )
									ret := 0.122449
				if( bbp > 0.387923 )
					if( bullPower <= 0.392371 )
						if( bbm <= 0.356077 )
							ret := 0.833333 // buy
						if( bbm > 0.356077 )
							ret := 1.000000 // buy
					if( bullPower > 0.392371 )
						if( bbp <= 0.581936 )
							if( bearPower <= 0.023233 )
								if( bullPower <= 0.397172 )
									ret := -0.500000
								if( bullPower > 0.397172 )
									ret := 0.390244
							if( bearPower > 0.023233 )
								ret := -1.000000 // sell
						if( bbp > 0.581936 )
							if( bbp <= 0.963091 )
								if( bbm <= 0.685 )
									ret := 1.000000 // buy
								if( bbm > 0.685 )
									ret := 0.800000 // buy
							if( bbp > 0.963091 )
								ret := 0.500000
		if( bearPower > 0.027585 )
			if( bbm <= 0.000157 )
				if( bullPower <= 0.074632 )
					if( bbp <= 0.076041 )
						if( bbp <= 0.074893 )
							if( bullPower <= 0.036172 )
								if( bearPower <= 0.035891 )
									ret := -0.075926
								if( bearPower > 0.035891 )
									ret := 0.600000
							if( bullPower > 0.036172 )
								if( bullPower <= 0.036772 )
									ret := -0.419355
								if( bullPower > 0.036772 )
									ret := -0.074074
						if( bbp > 0.074893 )
							if( bearPower <= 0.037897 )
								if( bullPower <= 0.037671 )
									ret := 0.862069 // buy
								if( bullPower > 0.037671 )
									ret := 0.500000
							if( bearPower > 0.037897 )
								if( bullPower <= 0.037976 )
									ret := 0.111111
								if( bullPower > 0.037976 )
									ret := 0.750000 // buy
					if( bbp > 0.076041 )
						if( bearPower <= 0.0645 )
							if( bearPower <= 0.064142 )
								if( bbp <= 0.128138 )
									ret := -0.213930
								if( bbp > 0.128138 )
									ret := 0.750000 // buy
							if( bearPower > 0.064142 )
								if( bullPower <= 0.064258 )
									ret := -1.000000 // sell
								if( bullPower > 0.064258 )
									ret := -0.700000 // sell
						if( bearPower > 0.0645 )
							if( bullPower <= 0.065037 )
								if( bbp <= 0.129396 )
									ret := 0.714286 // buy
								if( bbp > 0.129396 )
									ret := 0.384615
							if( bullPower > 0.065037 )
								if( bbp <= 0.138779 )
									ret := -0.018182
								if( bbp > 0.138779 )
									ret := -0.245098
				if( bullPower > 0.074632 )
					if( bullPower <= 0.276653 )
						if( bbp <= 0.35504 )
							if( bbp <= 0.32589 )
								if( bbp <= 0.321355 )
									ret := -0.362007
								if( bbp > 0.321355 )
									ret := 0.550000
							if( bbp > 0.32589 )
								if( bullPower <= 0.169676 )
									ret := -0.883333 // sell
								if( bullPower > 0.169676 )
									ret := -0.357143
						if( bbp > 0.35504 )
							if( bullPower <= 0.199783 )
								if( bbp <= 0.386431 )
									ret := -0.100000
								if( bbp > 0.386431 )
									ret := 0.322581
							if( bullPower > 0.199783 )
								if( bbm <= 1.5e-05 )
									ret := -0.379518
								if( bbm > 1.5e-05 )
									ret := 0.333333
					if( bullPower > 0.276653 )
						if( bearPower <= 0.451216 )
							if( bbp <= 0.625317 )
								if( bullPower <= 0.304657 )
									ret := -0.555556
								if( bullPower > 0.304657 )
									ret := -1.000000 // sell
							if( bbp > 0.625317 )
								if( bullPower <= 0.318144 )
									ret := 0.000000
								if( bullPower > 0.318144 )
									ret := -0.666667
						if( bearPower > 0.451216 )
							ret := -1.000000 // sell
			if( bbm > 0.000157 )
				if( bbm <= 0.070167 )
					if( bbp <= 0.592542 )
						if( bbp <= 0.550477 )
							if( bullPower <= 0.277189 )
								if( bullPower <= 0.106518 )
									ret := 0.048330
								if( bullPower > 0.106518 )
									ret := -0.046154
							if( bullPower > 0.277189 )
								if( bbp <= 0.508263 )
									ret := -1.000000 // sell
								if( bbp > 0.508263 )
									ret := -0.608696
						if( bbp > 0.550477 )
							if( bbm <= 0.042211 )
								ret := 0.166667
							if( bbm > 0.042211 )
								if( bearPower <= 0.257257 )
									ret := 0.962963 // buy
								if( bearPower > 0.257257 )
									ret := 0.666667
					if( bbp > 0.592542 )
						if( bbp <= 0.616883 )
							if( bullPower <= 0.310535 )
								ret := -0.800000 // sell
							if( bullPower > 0.310535 )
								ret := -1.000000 // sell
						if( bbp > 0.616883 )
							if( bullPower <= 0.359117 )
								if( bearPower <= 0.303275 )
									ret := -1.000000 // sell
								if( bearPower > 0.303275 )
									ret := 0.571429
							if( bullPower > 0.359117 )
								if( bbm <= 0.049764 )
									ret := -0.756098 // sell
								if( bbm > 0.049764 )
									ret := 0.200000
				if( bbm > 0.070167 )
					if( bearPower <= 0.040994 )
						if( bullPower <= 0.1502 )
							if( bbp <= 0.179287 )
								if( bbm <= 0.119729 )
									ret := -0.085470
								if( bbm > 0.119729 )
									ret := -0.875000 // sell
							if( bbp > 0.179287 )
								if( bbp <= 0.181224 )
									ret := -0.826087 // sell
								if( bbp > 0.181224 )
									ret := -0.500000
						if( bullPower > 0.1502 )
							if( bearPower <= 0.040557 )
								if( bbm <= 0.119886 )
									ret := 0.750000 // buy
								if( bbm > 0.119886 )
									ret := 0.023256
							if( bearPower > 0.040557 )
								if( bullPower <= 0.160572 )
									ret := 0.000000
								if( bullPower > 0.160572 )
									ret := -0.681818
					if( bearPower > 0.040994 )
						if( bearPower <= 0.422174 )
							if( bbp <= 0.978039 )
								if( bbp <= 0.167017 )
									ret := 0.622642
								if( bbp > 0.167017 )
									ret := 0.106820
							if( bbp > 0.978039 )
								if( bbm <= 0.5 )
									ret := 0.745763 // buy
								if( bbm > 0.5 )
									ret := -0.371429
						if( bearPower > 0.422174 )
							if( bbp <= 1.13115 )
								if( bearPower <= 0.453573 )
									ret := -0.884615 // sell
								if( bearPower > 0.453573 )
									ret := -0.600000
							if( bbp > 1.13115 )
								if( bullPower <= 0.75169 )
									ret := 0.680000
								if( bullPower > 0.75169 )
									ret := -0.400000
	
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
float op_operation = decision_tree_0_UPST_1Min_4b0d384c(bbp, bullPower, BBPower_Color, bearPower, bbm)

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


