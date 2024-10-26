//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: PINS_15Min_2SV0_e73f65a8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_2SV0_e73f65a8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_e73f65a8(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothK_k <= 0.153521 )
		if( VIP_VIM <= -0.777996 )
			if( d <= 3.50606 )
				if( k <= 1.49454 )
					if( smoothK_k <= -2.28736 )
						if( d_k <= -0.032745 )
							if( smoothD_d <= -2.76787 )
								if( rsi1 <= 11.7785 )
									ret := -0.461538
								if( rsi1 > 11.7785 )
									ret := 0.100000
							if( smoothD_d > -2.76787 )
								ret := -0.500000
						if( d_k > -0.032745 )
							if( VIM <= 1.41016 )
								if( smoothK_k <= -2.98111 )
									ret := 0.357143
								if( smoothK_k > -2.98111 )
									ret := -0.100000
							if( VIM > 1.41016 )
								if( VIP_VIM <= -0.877212 )
									ret := 0.506849
								if( VIP_VIM > -0.877212 )
									ret := 0.769912 // buy
					if( smoothK_k > -2.28736 )
						if( VIP <= 0.561775 )
							if( rsi1 <= 13.7822 )
								ret := 1.000000 // buy
							if( rsi1 > 13.7822 )
								ret := 0.900000 // buy
						if( VIP > 0.561775 )
							if( VIP <= 0.669002 )
								ret := 0.100000
							if( VIP > 0.669002 )
								if( smoothD_d <= -2.11791 )
									ret := 1.000000 // buy
								if( smoothD_d > -2.11791 )
									ret := 0.777778 // buy
				if( k > 1.49454 )
					if( rsi1 <= 36.2161 )
						if( VIP <= 0.684989 )
							if( rsi1 <= 12.8756 )
								ret := -0.750000 // sell
							if( rsi1 > 12.8756 )
								ret := 0.333333
						if( VIP > 0.684989 )
							ret := 0.750000 // buy
					if( rsi1 > 36.2161 )
						ret := -1.000000 // sell
			if( d > 3.50606 )
				if( smoothK_k <= -2.53513 )
					if( VIP <= 0.560766 )
						if( rsi1 <= 15.3955 )
							if( VIP <= 0.525133 )
								ret := 0.625000
							if( VIP > 0.525133 )
								ret := 1.000000 // buy
						if( rsi1 > 15.3955 )
							ret := 0.272727
					if( VIP > 0.560766 )
						if( VIM <= 1.41579 )
							ret := -0.333333
						if( VIM > 1.41579 )
							if( smoothD_d <= 0.965237 )
								ret := 0.000000
							if( smoothD_d > 0.965237 )
								if( VIM <= 1.69262 )
									ret := 0.758621 // buy
								if( VIM > 1.69262 )
									ret := 0.172414
				if( smoothK_k > -2.53513 )
					if( VIM <= 1.76039 )
						if( d <= 11.0076 )
							if( d_k <= 5.93916 )
								if( rsi1 <= 11.1351 )
									ret := -0.857143 // sell
								if( rsi1 > 11.1351 )
									ret := 0.461538
							if( d_k > 5.93916 )
								ret := -0.444444
						if( d > 11.0076 )
							if( smoothD_d <= 12.3339 )
								ret := 0.714286 // buy
							if( smoothD_d > 12.3339 )
								ret := 0.818182 // buy
					if( VIM > 1.76039 )
						if( rsi1 <= 19.0289 )
							ret := -0.333333
						if( rsi1 > 19.0289 )
							if( smoothK_k <= -1.20137 )
								if( smoothK_k <= -1.38414 )
									ret := -0.800000 // sell
								if( smoothK_k > -1.38414 )
									ret := -1.000000 // sell
							if( smoothK_k > -1.20137 )
								ret := -0.500000
		if( VIP_VIM > -0.777996 )
			if( VIM <= 1.11662 )
				if( rsi1 <= 43.3228 )
					if( d_k <= 6.93647 )
						if( rsi1 <= 31.4279 )
							if( rsi1 <= 28.2028 )
								ret := 0.555556
							if( rsi1 > 28.2028 )
								if( VIP_VIM <= -0.257275 )
									ret := 0.928571 // buy
								if( VIP_VIM > -0.257275 )
									ret := 1.000000 // buy
						if( rsi1 > 31.4279 )
							if( k <= 1.75186 )
								if( VIP <= 0.91727 )
									ret := 0.043011
								if( VIP > 0.91727 )
									ret := 0.520325
							if( k > 1.75186 )
								if( rsi1 <= 42.7007 )
									ret := 0.766234 // buy
								if( rsi1 > 42.7007 )
									ret := 0.428571
					if( d_k > 6.93647 )
						if( smoothD_d <= 8.48571 )
							if( rsi1 <= 38.234 )
								if( d <= 8.17303 )
									ret := -0.400000
								if( d > 8.17303 )
									ret := -0.750000 // sell
							if( rsi1 > 38.234 )
								ret := 0.210526
						if( smoothD_d > 8.48571 )
							if( VIP <= 0.922464 )
								if( VIP <= 0.893769 )
									ret := 0.235294
								if( VIP > 0.893769 )
									ret := 0.678571
							if( VIP > 0.922464 )
								if( VIP_VIM <= -0.134928 )
									ret := 0.400000
								if( VIP_VIM > -0.134928 )
									ret := -0.200000
				if( rsi1 > 43.3228 )
					if( smoothD_d <= -2.13035 )
						if( rsi1 <= 51.4841 )
							if( VIP_VIM <= -0.088 )
								ret := -0.761905 // sell
							if( VIP_VIM > -0.088 )
								if( d_k <= 0.006046 )
									ret := 0.204545
								if( d_k > 0.006046 )
									ret := -0.142857
						if( rsi1 > 51.4841 )
							if( k <= 0.147761 )
								if( VIP_VIM <= 0.19075 )
									ret := -0.962963 // sell
								if( VIP_VIM > 0.19075 )
									ret := -0.700000 // sell
							if( k > 0.147761 )
								ret := 0.000000
					if( smoothD_d > -2.13035 )
						if( VIM <= 0.945494 )
							if( k <= 1.03121 )
								if( d_k <= 3.45131 )
									ret := -0.450000
								if( d_k > 3.45131 )
									ret := 0.384615
							if( k > 1.03121 )
								if( VIM <= 0.918229 )
									ret := 0.454545
								if( VIM > 0.918229 )
									ret := 0.806452 // buy
						if( VIM > 0.945494 )
							if( d <= 25.5228 )
								if( smoothK_k <= 0.105048 )
									ret := 0.165669
								if( smoothK_k > 0.105048 )
									ret := 0.666667
							if( d > 25.5228 )
								ret := -0.583333
			if( VIM > 1.11662 )
				if( d_k <= -0.018241 )
					if( smoothD_d <= -1.26457 )
						if( d_k <= -0.176705 )
							if( smoothK_k <= -0.321371 )
								if( k <= 1.51448 )
									ret := 0.025532
								if( k > 1.51448 )
									ret := 0.264706
							if( smoothK_k > -0.321371 )
								if( VIP <= 0.723221 )
									ret := 0.153846
								if( VIP > 0.723221 )
									ret := -0.551724
						if( d_k > -0.176705 )
							if( k <= 0.227676 )
								if( d_k <= -0.055159 )
									ret := 0.240000
								if( d_k > -0.055159 )
									ret := -0.400000
							if( k > 0.227676 )
								if( rsi1 <= 17.5867 )
									ret := -0.829268 // sell
								if( rsi1 > 17.5867 )
									ret := -0.170213
					if( smoothD_d > -1.26457 )
						if( smoothD_d <= -1.04993 )
							if( VIP <= 0.912291 )
								if( d <= 1.83837 )
									ret := -0.789474 // sell
								if( d > 1.83837 )
									ret := -0.263158
							if( VIP > 0.912291 )
								if( smoothK_k <= -0.232004 )
									ret := -0.950000 // sell
								if( smoothK_k > -0.232004 )
									ret := -0.888889 // sell
						if( smoothD_d > -1.04993 )
							if( VIP <= 0.84024 )
								if( rsi1 <= 14.7675 )
									ret := -0.294118
								if( rsi1 > 14.7675 )
									ret := 0.375000
							if( VIP > 0.84024 )
								if( VIM <= 1.20061 )
									ret := 0.142857
								if( VIM > 1.20061 )
									ret := -0.645161
				if( d_k > -0.018241 )
					if( rsi1 <= 48.9842 )
						if( VIM <= 1.38597 )
							if( rsi1 <= 22.1943 )
								if( smoothD_d <= 27.1565 )
									ret := -0.123878
								if( smoothD_d > 27.1565 )
									ret := 1.000000 // buy
							if( rsi1 > 22.1943 )
								if( k <= 2.94841 )
									ret := 0.106624
								if( k > 2.94841 )
									ret := 0.584615
						if( VIM > 1.38597 )
							if( VIM <= 2.05279 )
								if( smoothD_d <= 1.48945 )
									ret := 0.397206
								if( smoothD_d > 1.48945 )
									ret := 0.125000
							if( VIM > 2.05279 )
								if( VIP_VIM <= -0.098119 )
									ret := 0.067961
								if( VIP_VIM > -0.098119 )
									ret := -0.480000
					if( rsi1 > 48.9842 )
						if( d <= 25.3233 )
							if( VIM <= 1.31214 )
								if( d <= 5.82171 )
									ret := 1.000000 // buy
								if( d > 5.82171 )
									ret := 0.741935 // buy
							if( VIM > 1.31214 )
								if( VIP_VIM <= -0.484644 )
									ret := -0.100000
								if( VIP_VIM > -0.484644 )
									ret := 0.563636
						if( d > 25.3233 )
							ret := -0.384615
	if( smoothK_k > 0.153521 )
		if( VIP <= 1.49877 )
			if( rsi1 <= 47.4567 )
				if( d_k <= -7.00029 )
					if( VIM <= 1.35086 )
						if( smoothD_d <= 3.22546 )
							if( VIP_VIM <= -0.46467 )
								if( rsi1 <= 32.4464 )
									ret := 0.000000
								if( rsi1 > 32.4464 )
									ret := -0.888889 // sell
							if( VIP_VIM > -0.46467 )
								if( rsi1 <= 38.708 )
									ret := -1.000000 // sell
								if( rsi1 > 38.708 )
									ret := -0.533333
						if( smoothD_d > 3.22546 )
							if( rsi1 <= 46.2647 )
								if( VIP_VIM <= -0.23663 )
									ret := -0.103163
								if( VIP_VIM > -0.23663 )
									ret := 0.019154
							if( rsi1 > 46.2647 )
								if( VIP_VIM <= -0.168133 )
									ret := 0.186813
								if( VIP_VIM > -0.168133 )
									ret := -0.312020
					if( VIM > 1.35086 )
						if( smoothD_d <= 38.654 )
							if( VIP <= 1.09955 )
								if( k <= 26.9332 )
									ret := -0.282828
								if( k > 26.9332 )
									ret := 0.010453
							if( VIP > 1.09955 )
								if( rsi1 <= 33.1669 )
									ret := 0.649351
								if( rsi1 > 33.1669 )
									ret := 0.051360
						if( smoothD_d > 38.654 )
							if( smoothK_k <= 86.7817 )
								if( k <= 55.1586 )
									ret := -0.096774
								if( k > 55.1586 )
									ret := 0.441281
							if( smoothK_k > 86.7817 )
								if( d <= 84.1417 )
									ret := -0.580645
								if( d > 84.1417 )
									ret := 0.250000
				if( d_k > -7.00029 )
					if( k <= 4.27938 )
						if( VIM <= 1.3476 )
							if( smoothD_d <= -1.83292 )
								ret := 0.733333 // buy
							if( smoothD_d > -1.83292 )
								if( VIP <= 0.71192 )
									ret := 0.266667
								if( VIP > 0.71192 )
									ret := -0.184514
						if( VIM > 1.3476 )
							if( VIP_VIM <= -0.32851 )
								if( d_k <= 4.37895 )
									ret := -0.382716
								if( d_k > 4.37895 )
									ret := -0.833333 // sell
							if( VIP_VIM > -0.32851 )
								if( smoothD_d <= 12.8573 )
									ret := -0.125000
								if( smoothD_d > 12.8573 )
									ret := 0.923077 // buy
					if( k > 4.27938 )
						if( d_k <= 30.9414 )
							if( VIM <= 1.34089 )
								if( VIP_VIM <= 0.228022 )
									ret := 0.053850
								if( VIP_VIM > 0.228022 )
									ret := 0.408163
							if( VIM > 1.34089 )
								if( d_k <= -2.34384 )
									ret := 0.273346
								if( d_k > -2.34384 )
									ret := 0.122754
						if( d_k > 30.9414 )
							if( VIP <= 0.837519 )
								if( k <= 21.3487 )
									ret := -0.333333
								if( k > 21.3487 )
									ret := 0.636364
							if( VIP > 0.837519 )
								if( rsi1 <= 41.2317 )
									ret := -0.676056
								if( rsi1 > 41.2317 )
									ret := 0.285714
			if( rsi1 > 47.4567 )
				if( VIM <= 0.935754 )
					if( smoothK_k <= 79.3363 )
						if( smoothK_k <= 74.7948 )
							if( rsi1 <= 72.4785 )
								if( VIP_VIM <= 0.332184 )
									ret := -0.028804
								if( VIP_VIM > 0.332184 )
									ret := 0.135503
							if( rsi1 > 72.4785 )
								if( VIP <= 1.2484 )
									ret := 0.029954
								if( VIP > 1.2484 )
									ret := -0.164027
						if( smoothK_k > 74.7948 )
							if( rsi1 <= 63.7635 )
								if( smoothD_d <= 60.2377 )
									ret := -0.357143
								if( smoothD_d > 60.2377 )
									ret := 0.408284
							if( rsi1 > 63.7635 )
								if( smoothD_d <= 87.7322 )
									ret := 0.095745
								if( smoothD_d > 87.7322 )
									ret := -0.595745
					if( smoothK_k > 79.3363 )
						if( rsi1 <= 58.5781 )
							if( smoothD_d <= 96.4723 )
								if( VIP_VIM <= 0.380517 )
									ret := 0.131907
								if( VIP_VIM > 0.380517 )
									ret := 0.744681 // buy
							if( smoothD_d > 96.4723 )
								ret := -1.000000 // sell
						if( rsi1 > 58.5781 )
							if( VIP <= 1.1178 )
								if( d_k <= 3.07621 )
									ret := -0.183413
								if( d_k > 3.07621 )
									ret := -0.552083
							if( VIP > 1.1178 )
								if( smoothD_d <= 71.2152 )
									ret := 0.138587
								if( smoothD_d > 71.2152 )
									ret := -0.059147
				if( VIM > 0.935754 )
					if( smoothK_k <= 95.7135 )
						if( k <= 98.359 )
							if( k <= 20.0389 )
								if( d_k <= -2.73001 )
									ret := -0.158816
								if( d_k > -2.73001 )
									ret := 0.064083
							if( k > 20.0389 )
								if( d <= 97.0205 )
									ret := -0.078644
								if( d > 97.0205 )
									ret := 0.163636
						if( k > 98.359 )
							if( smoothD_d <= 87.874 )
								ret := 0.000000
							if( smoothD_d > 87.874 )
								if( d_k <= -0.24411 )
									ret := -0.520000
								if( d_k > -0.24411 )
									ret := -0.870968 // sell
					if( smoothK_k > 95.7135 )
						if( VIM <= 1.40233 )
							if( VIP <= 1.34815 )
								if( k <= 99.7429 )
									ret := 0.271318
								if( k > 99.7429 )
									ret := 0.032967
							if( VIP > 1.34815 )
								if( VIP <= 1.37498 )
									ret := -0.750000 // sell
								if( VIP > 1.37498 )
									ret := -0.178947
						if( VIM > 1.40233 )
							if( smoothD_d <= 95.6471 )
								if( VIM <= 1.47935 )
									ret := 0.789474 // buy
								if( VIM > 1.47935 )
									ret := 0.043478
							if( smoothD_d > 95.6471 )
								ret := 0.882353 // buy
		if( VIP > 1.49877 )
			if( d_k <= 9.13517 )
				if( VIP_VIM <= -0.143976 )
					if( k <= 99.424 )
						if( d_k <= -16.0408 )
							if( smoothD_d <= 12.9567 )
								if( rsi1 <= 58.729 )
									ret := -0.750000 // sell
								if( rsi1 > 58.729 )
									ret := -1.000000 // sell
							if( smoothD_d > 12.9567 )
								if( VIM <= 2.12008 )
									ret := -0.678571
								if( VIM > 2.12008 )
									ret := -0.309735
						if( d_k > -16.0408 )
							if( rsi1 <= 45.3554 )
								if( smoothD_d <= 29.0981 )
									ret := 0.181992
								if( smoothD_d > 29.0981 )
									ret := 0.522472
							if( rsi1 > 45.3554 )
								if( smoothD_d <= 70.499 )
									ret := -0.179528
								if( smoothD_d > 70.499 )
									ret := 0.212329
					if( k > 99.424 )
						if( smoothK_k <= 96.9393 )
							ret := -0.916667 // sell
						if( smoothK_k > 96.9393 )
							ret := -0.333333
				if( VIP_VIM > -0.143976 )
					if( VIP <= 5.39013 )
						if( VIM <= 0.471501 )
							if( d_k <= -1.38948 )
								ret := 0.133333
							if( d_k > -1.38948 )
								if( VIP_VIM <= 1.13163 )
									ret := 0.416667
								if( VIP_VIM > 1.13163 )
									ret := 1.000000 // buy
						if( VIM > 0.471501 )
							if( k <= 98.7506 )
								if( smoothK_k <= 9.06013 )
									ret := 0.028125
								if( smoothK_k > 9.06013 )
									ret := -0.148512
							if( k > 98.7506 )
								if( VIP_VIM <= 0.863768 )
									ret := -0.447639
								if( VIP_VIM > 0.863768 )
									ret := 0.042918
					if( VIP > 5.39013 )
						if( smoothK_k <= 74.964 )
							if( d <= 52.314 )
								if( VIP_VIM <= 0.633227 )
									ret := 0.228571
								if( VIP_VIM > 0.633227 )
									ret := -0.125000
							if( d > 52.314 )
								if( smoothD_d <= 56.1409 )
									ret := 0.812500 // buy
								if( smoothD_d > 56.1409 )
									ret := 0.454545
						if( smoothK_k > 74.964 )
							if( rsi1 <= 56.0222 )
								ret := 0.500000
							if( rsi1 > 56.0222 )
								if( VIP_VIM <= 1.12061 )
									ret := -0.050000
								if( VIP_VIM > 1.12061 )
									ret := -0.500000
			if( d_k > 9.13517 )
				if( smoothD_d <= 26.9283 )
					if( VIP_VIM <= -0.530065 )
						ret := -0.652174
					if( VIP_VIM > -0.530065 )
						if( rsi1 <= 49.6481 )
							if( VIP <= 1.90477 )
								if( smoothK_k <= 5.08871 )
									ret := 0.756098 // buy
								if( smoothK_k > 5.08871 )
									ret := 1.000000 // buy
							if( VIP > 1.90477 )
								if( d_k <= 13.1151 )
									ret := 0.851852 // buy
								if( d_k > 13.1151 )
									ret := 0.083333
						if( rsi1 > 49.6481 )
							if( VIM <= 1.73418 )
								if( k <= 5.92305 )
									ret := -0.058824
								if( k > 5.92305 )
									ret := 0.622222
							if( VIM > 1.73418 )
								ret := -0.333333
				if( smoothD_d > 26.9283 )
					if( d <= 33.2337 )
						if( k <= 15.6182 )
							if( k <= 12.1392 )
								ret := 0.444444
							if( k > 12.1392 )
								ret := 0.000000
						if( k > 15.6182 )
							if( VIM <= 2.35115 )
								if( d <= 31.822 )
									ret := -0.714286 // sell
								if( d > 31.822 )
									ret := -1.000000 // sell
							if( VIM > 2.35115 )
								ret := 0.083333
					if( d > 33.2337 )
						if( k <= 31.3779 )
							if( smoothD_d <= 37.3113 )
								if( d_k <= 14.7544 )
									ret := 0.121212
								if( d_k > 14.7544 )
									ret := 0.666667
							if( smoothD_d > 37.3113 )
								if( k <= 22.4762 )
									ret := -0.297297
								if( k > 22.4762 )
									ret := 0.268750
						if( k > 31.3779 )
							if( smoothD_d <= 59.4958 )
								if( VIP_VIM <= 0.331667 )
									ret := -0.335938
								if( VIP_VIM > 0.331667 )
									ret := 0.122951
							if( smoothD_d > 59.4958 )
								if( rsi1 <= 46.1988 )
									ret := 0.399123
								if( rsi1 > 46.1988 )
									ret := 0.061960
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")

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
float op_operation = decision_tree_0_PINS_15Min_e73f65a8(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


