//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: VETUSDT_15Min_1ICH_c3ebb68e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_1ICH_c3ebb68e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_c3ebb68e(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( basis_minus <= 0.000269 )
		if( kinjun_sen <= 0.048708 )
			if( chinkou_span <= 0.047467 )
				if( basis_max <= -0.00023 )
					if( senkou_span_b <= 0.039483 )
						if( chinkou_span <= 0.039244 )
							if( senkou_span_b_displaced <= 0.032334 )
								if( senkou_span_a <= 0.022715 )
									ret := 0.580247
								if( senkou_span_a > 0.022715 )
									ret := -0.123810
							if( senkou_span_b_displaced > 0.032334 )
								if( senkou_span_b <= 0.034767 )
									ret := -0.958763 // sell
								if( senkou_span_b > 0.034767 )
									ret := -0.324324
						if( chinkou_span > 0.039244 )
							if( basis_max <= -0.000243 )
								if( basis_minus <= 0.000251 )
									ret := 1.000000 // buy
								if( basis_minus > 0.000251 )
									ret := 0.916667 // buy
							if( basis_max > -0.000243 )
								ret := 0.000000
					if( senkou_span_b > 0.039483 )
						if( tenkan_sen <= 0.044553 )
							if( chinkou_span <= 0.04363 )
								if( senkou_span_b_displaced <= 0.045359 )
									ret := -0.884058 // sell
								if( senkou_span_b_displaced > 0.045359 )
									ret := -0.454545
							if( chinkou_span > 0.04363 )
								if( basis_minus <= 1.8e-05 )
									ret := -0.770492 // sell
								if( basis_minus > 1.8e-05 )
									ret := 0.500000
						if( tenkan_sen > 0.044553 )
							if( senkou_span_a <= 0.047849 )
								if( senkou_span_b <= 0.044486 )
									ret := 0.538462
								if( senkou_span_b > 0.044486 )
									ret := -0.294118
							if( senkou_span_a > 0.047849 )
								ret := 0.750000 // buy
				if( basis_max > -0.00023 )
					if( chinkou_span <= 0.023542 )
						if( senkou_span_b <= 0.022877 )
							if( chinkou_span <= 0.022654 )
								if( senkou_span_a <= 0.02258 )
									ret := 0.016227
								if( senkou_span_a > 0.02258 )
									ret := -0.442892
							if( chinkou_span > 0.022654 )
								if( basis_max <= -0.000109 )
									ret := 0.072727
								if( basis_max > -0.000109 )
									ret := 0.404216
						if( senkou_span_b > 0.022877 )
							if( tenkan_sen <= 0.023527 )
								if( tenkan_sen <= 0.023303 )
									ret := -0.091088
								if( tenkan_sen > 0.023303 )
									ret := -0.280495
							if( tenkan_sen > 0.023527 )
								if( chinkou_span <= 0.023264 )
									ret := -0.676817
								if( chinkou_span > 0.023264 )
									ret := -0.355157
					if( chinkou_span > 0.023542 )
						if( senkou_span_b_displaced <= 0.023664 )
							if( senkou_span_a <= 0.023662 )
								if( basis_minus <= -0.000183 )
									ret := 0.891213 // buy
								if( basis_minus > -0.000183 )
									ret := 0.474576
							if( senkou_span_a > 0.023662 )
								if( chinkou_span <= 0.024418 )
									ret := -0.129927
								if( chinkou_span > 0.024418 )
									ret := 0.636620
						if( senkou_span_b_displaced > 0.023664 )
							if( senkou_span_a <= 0.025644 )
								if( kinjun_sen <= 0.023461 )
									ret := 0.670157
								if( kinjun_sen > 0.023461 )
									ret := 0.095417
							if( senkou_span_a > 0.025644 )
								if( senkou_span_a <= 0.046302 )
									ret := 0.002894
								if( senkou_span_a > 0.046302 )
									ret := -0.286408
			if( chinkou_span > 0.047467 )
				if( tenkan_sen <= 0.048522 )
					if( senkou_span_b_displaced <= 0.047683 )
						if( senkou_span_b <= 0.045493 )
							if( senkou_span_a <= 0.044871 )
								ret := 0.866667 // buy
							if( senkou_span_a > 0.044871 )
								ret := 1.000000 // buy
						if( senkou_span_b > 0.045493 )
							if( senkou_span_b_displaced <= 0.04712 )
								if( senkou_span_b_displaced <= 0.046937 )
									ret := 0.551020
								if( senkou_span_b_displaced > 0.046937 )
									ret := -0.200000
							if( senkou_span_b_displaced > 0.04712 )
								if( senkou_span_a_displaced <= 0.047905 )
									ret := 0.928571 // buy
								if( senkou_span_a_displaced > 0.047905 )
									ret := 0.548387
					if( senkou_span_b_displaced > 0.047683 )
						if( chinkou_span <= 0.047596 )
							if( tenkan_sen <= 0.047548 )
								if( basis_max <= 0.000171 )
									ret := -0.481481
								if( basis_max > 0.000171 )
									ret := -0.083333
							if( tenkan_sen > 0.047548 )
								if( kinjun_sen <= 0.04773 )
									ret := 1.000000 // buy
								if( kinjun_sen > 0.04773 )
									ret := -0.200000
						if( chinkou_span > 0.047596 )
							if( basis_max <= 0.000299 )
								if( kinjun_sen <= 0.048636 )
									ret := 0.397516
								if( kinjun_sen > 0.048636 )
									ret := 0.928571 // buy
							if( basis_max > 0.000299 )
								if( basis_minus <= -0.00096 )
									ret := 1.000000 // buy
								if( basis_minus > -0.00096 )
									ret := 0.846154 // buy
				if( tenkan_sen > 0.048522 )
					if( tenkan_sen <= 0.049143 )
						if( chinkou_span <= 0.050421 )
							if( tenkan_sen <= 0.048845 )
								if( chinkou_span <= 0.048838 )
									ret := -0.625000
								if( chinkou_span > 0.048838 )
									ret := -0.022727
							if( tenkan_sen > 0.048845 )
								if( senkou_span_b_displaced <= 0.048882 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 0.048882 )
									ret := -0.846154 // sell
						if( chinkou_span > 0.050421 )
							ret := 0.705882 // buy
					if( tenkan_sen > 0.049143 )
						ret := 0.941176 // buy
		if( kinjun_sen > 0.048708 )
			if( senkou_span_a <= 0.051982 )
				if( senkou_span_b <= 0.051574 )
					if( basis_max <= 0.000274 )
						if( chinkou_span <= 0.049078 )
							if( tenkan_sen <= 0.048506 )
								if( chinkou_span <= 0.048545 )
									ret := 0.250000
								if( chinkou_span > 0.048545 )
									ret := 0.818182 // buy
							if( tenkan_sen > 0.048506 )
								if( tenkan_sen <= 0.049272 )
									ret := -0.467797
								if( tenkan_sen > 0.049272 )
									ret := -0.761658 // sell
						if( chinkou_span > 0.049078 )
							if( basis_max <= 9.7e-05 )
								if( kinjun_sen <= 0.050238 )
									ret := 0.063380
								if( kinjun_sen > 0.050238 )
									ret := -0.773109 // sell
							if( basis_max > 9.7e-05 )
								if( senkou_span_b <= 0.050639 )
									ret := 0.548387
								if( senkou_span_b > 0.050639 )
									ret := -0.125000
					if( basis_max > 0.000274 )
						if( basis_max <= 0.000398 )
							if( tenkan_sen <= 0.049269 )
								if( tenkan_sen <= 0.048611 )
									ret := 0.500000
								if( tenkan_sen > 0.048611 )
									ret := 0.909091 // buy
							if( tenkan_sen > 0.049269 )
								if( senkou_span_b_displaced <= 0.049553 )
									ret := 0.909091 // buy
								if( senkou_span_b_displaced > 0.049553 )
									ret := -0.103448
						if( basis_max > 0.000398 )
							if( senkou_span_a_displaced <= 0.048395 )
								if( senkou_span_a <= 0.048395 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.048395 )
									ret := -0.500000
							if( senkou_span_a_displaced > 0.048395 )
								if( senkou_span_b_displaced <= 0.04924 )
									ret := 0.750000 // buy
								if( senkou_span_b_displaced > 0.04924 )
									ret := -0.214286
				if( senkou_span_b > 0.051574 )
					if( tenkan_sen <= 0.051496 )
						if( chinkou_span <= 0.051179 )
							ret := -0.222222
						if( chinkou_span > 0.051179 )
							if( basis_minus <= -0.000235 )
								ret := 1.000000 // buy
							if( basis_minus > -0.000235 )
								ret := 0.894737 // buy
					if( tenkan_sen > 0.051496 )
						if( senkou_span_a_displaced <= 0.052084 )
							if( senkou_span_a_displaced <= 0.051618 )
								ret := -0.555556
							if( senkou_span_a_displaced > 0.051618 )
								if( senkou_span_b <= 0.05195 )
									ret := 0.540541
								if( senkou_span_b > 0.05195 )
									ret := -0.500000
						if( senkou_span_a_displaced > 0.052084 )
							ret := -0.736842 // sell
			if( senkou_span_a > 0.051982 )
				if( kinjun_sen <= 0.053169 )
					if( basis_max <= -0.000118 )
						ret := -0.846154 // sell
					if( basis_max > -0.000118 )
						ret := -1.000000 // sell
				if( kinjun_sen > 0.053169 )
					ret := -0.666667
	if( basis_minus > 0.000269 )
		if( senkou_span_a_displaced <= 0.029747 )
			if( senkou_span_a <= 0.02866 )
				if( basis_max <= 8e-06 )
					if( chinkou_span <= 0.028697 )
						if( tenkan_sen <= 0.027883 )
							if( senkou_span_b <= 0.023915 )
								if( senkou_span_b_displaced <= 0.023624 )
									ret := -0.097119
								if( senkou_span_b_displaced > 0.023624 )
									ret := -0.756303 // sell
							if( senkou_span_b > 0.023915 )
								if( kinjun_sen <= 0.025516 )
									ret := 0.195327
								if( kinjun_sen > 0.025516 )
									ret := -0.183176
						if( tenkan_sen > 0.027883 )
							if( senkou_span_b_displaced <= 0.027228 )
								if( senkou_span_a_displaced <= 0.026789 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 0.026789 )
									ret := -0.643478
							if( senkou_span_b_displaced > 0.027228 )
								if( senkou_span_a <= 0.028611 )
									ret := -0.250000
								if( senkou_span_a > 0.028611 )
									ret := -1.000000 // sell
					if( chinkou_span > 0.028697 )
						if( senkou_span_a <= 0.028152 )
							if( chinkou_span <= 0.029504 )
								ret := 1.000000 // buy
							if( chinkou_span > 0.029504 )
								ret := 0.857143 // buy
						if( senkou_span_a > 0.028152 )
							if( senkou_span_b_displaced <= 0.027884 )
								if( basis_max <= -0.000105 )
									ret := 0.347826
								if( basis_max > -0.000105 )
									ret := 1.000000 // buy
							if( senkou_span_b_displaced > 0.027884 )
								ret := -0.285714
				if( basis_max > 8e-06 )
					if( senkou_span_b_displaced <= 0.02034 )
						if( senkou_span_b_displaced <= 0.017636 )
							if( tenkan_sen <= 0.017195 )
								ret := -0.227273
							if( tenkan_sen > 0.017195 )
								if( basis_minus <= 0.000418 )
									ret := 0.800000 // buy
								if( basis_minus > 0.000418 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 0.017636 )
							if( senkou_span_b <= 0.018678 )
								if( tenkan_sen <= 0.018814 )
									ret := -0.709677 // sell
								if( tenkan_sen > 0.018814 )
									ret := -1.000000 // sell
							if( senkou_span_b > 0.018678 )
								if( kinjun_sen <= 0.020274 )
									ret := 0.125000
								if( kinjun_sen > 0.020274 )
									ret := -0.575000
					if( senkou_span_b_displaced > 0.02034 )
						if( tenkan_sen <= 0.02322 )
							if( basis_minus <= 0.000346 )
								if( senkou_span_b <= 0.022867 )
									ret := 0.123457
								if( senkou_span_b > 0.022867 )
									ret := 0.681818
							if( basis_minus > 0.000346 )
								if( kinjun_sen <= 0.020987 )
									ret := 0.973684 // buy
								if( kinjun_sen > 0.020987 )
									ret := 0.779528 // buy
						if( tenkan_sen > 0.02322 )
							if( kinjun_sen <= 0.023466 )
								if( kinjun_sen <= 0.023406 )
									ret := -0.576923
								if( kinjun_sen > 0.023406 )
									ret := -0.827586 // sell
							if( kinjun_sen > 0.023466 )
								if( senkou_span_a <= 0.024434 )
									ret := 0.441667
								if( senkou_span_a > 0.024434 )
									ret := -0.118110
			if( senkou_span_a > 0.02866 )
				if( basis_minus <= 0.001051 )
					if( kinjun_sen <= 0.029651 )
						if( tenkan_sen <= 0.029447 )
							if( chinkou_span <= 0.03054 )
								if( senkou_span_a <= 0.029126 )
									ret := 0.142857
								if( senkou_span_a > 0.029126 )
									ret := -0.500000
							if( chinkou_span > 0.03054 )
								if( senkou_span_b_displaced <= 0.028744 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 0.028744 )
									ret := 0.875000 // buy
						if( tenkan_sen > 0.029447 )
							if( basis_max <= -0.000367 )
								if( basis_minus <= 0.000739 )
									ret := 0.440000
								if( basis_minus > 0.000739 )
									ret := -0.272727
							if( basis_max > -0.000367 )
								if( tenkan_sen <= 0.029646 )
									ret := 0.584416
								if( tenkan_sen > 0.029646 )
									ret := 0.862500 // buy
					if( kinjun_sen > 0.029651 )
						if( chinkou_span <= 0.02959 )
							if( senkou_span_a <= 0.029896 )
								if( senkou_span_a <= 0.029757 )
									ret := -1.000000 // sell
								if( senkou_span_a > 0.029757 )
									ret := -0.250000
							if( senkou_span_a > 0.029896 )
								if( basis_max <= -5.6e-05 )
									ret := -1.000000 // sell
								if( basis_max > -5.6e-05 )
									ret := -0.818182 // sell
						if( chinkou_span > 0.02959 )
							if( basis_max <= -0.000128 )
								if( basis_minus <= 0.000513 )
									ret := -0.431373
								if( basis_minus > 0.000513 )
									ret := 0.203046
							if( basis_max > -0.000128 )
								if( senkou_span_b_displaced <= 0.029495 )
									ret := -0.304348
								if( senkou_span_b_displaced > 0.029495 )
									ret := 0.764706 // buy
				if( basis_minus > 0.001051 )
					if( tenkan_sen <= 0.031808 )
						if( basis_max <= -0.000135 )
							if( senkou_span_a <= 0.03005 )
								ret := 0.333333
							if( senkou_span_a > 0.03005 )
								if( basis_minus <= 0.001381 )
									ret := 1.000000 // buy
								if( basis_minus > 0.001381 )
									ret := 0.840909 // buy
						if( basis_max > -0.000135 )
							if( senkou_span_b <= 0.029165 )
								ret := 1.000000 // buy
							if( senkou_span_b > 0.029165 )
								ret := -0.571429
					if( tenkan_sen > 0.031808 )
						if( senkou_span_a_displaced <= 0.02846 )
							if( basis_minus <= 0.001566 )
								ret := -0.538462
							if( basis_minus > 0.001566 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 0.02846 )
							if( senkou_span_b_displaced <= 0.028472 )
								ret := -0.818182 // sell
							if( senkou_span_b_displaced > 0.028472 )
								ret := 0.000000
		if( senkou_span_a_displaced > 0.029747 )
			if( chinkou_span <= 0.033379 )
				if( tenkan_sen <= 0.032771 )
					if( basis_minus <= 0.000497 )
						if( senkou_span_b <= 0.030965 )
							if( senkou_span_b <= 0.030026 )
								if( tenkan_sen <= 0.03031 )
									ret := -0.600000
								if( tenkan_sen > 0.03031 )
									ret := 0.350000
							if( senkou_span_b > 0.030026 )
								if( senkou_span_b_displaced <= 0.029852 )
									ret := -0.181818
								if( senkou_span_b_displaced > 0.029852 )
									ret := -0.697917
						if( senkou_span_b > 0.030965 )
							if( senkou_span_b <= 0.031165 )
								if( basis_max <= -0.000111 )
									ret := 0.647727
								if( basis_max > -0.000111 )
									ret := 0.068182
							if( senkou_span_b > 0.031165 )
								if( senkou_span_a <= 0.031672 )
									ret := -0.779661 // sell
								if( senkou_span_a > 0.031672 )
									ret := -0.325333
					if( basis_minus > 0.000497 )
						if( basis_max <= -0.000105 )
							if( senkou_span_b_displaced <= 0.030005 )
								if( senkou_span_a <= 0.03137 )
									ret := -0.456311
								if( senkou_span_a > 0.03137 )
									ret := 0.046512
							if( senkou_span_b_displaced > 0.030005 )
								if( senkou_span_b_displaced <= 0.030171 )
									ret := -0.960000 // sell
								if( senkou_span_b_displaced > 0.030171 )
									ret := -0.273810
						if( basis_max > -0.000105 )
							if( basis_minus <= 0.00114 )
								if( basis_max <= 0.00011 )
									ret := 0.082005
								if( basis_max > 0.00011 )
									ret := -0.589744
							if( basis_minus > 0.00114 )
								if( senkou_span_b_displaced <= 0.030907 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 0.030907 )
									ret := 0.285714
				if( tenkan_sen > 0.032771 )
					if( senkou_span_b <= 0.03078 )
						ret := 0.777778 // buy
					if( senkou_span_b > 0.03078 )
						if( basis_max <= 0.000116 )
							if( senkou_span_a <= 0.033321 )
								if( senkou_span_a_displaced <= 0.031552 )
									ret := -0.945946 // sell
								if( senkou_span_a_displaced > 0.031552 )
									ret := -0.562500
							if( senkou_span_a > 0.033321 )
								if( senkou_span_b_displaced <= 0.03304 )
									ret := -0.943396 // sell
								if( senkou_span_b_displaced > 0.03304 )
									ret := -0.629630
						if( basis_max > 0.000116 )
							ret := 1.000000 // buy
			if( chinkou_span > 0.033379 )
				if( tenkan_sen <= 0.033972 )
					if( senkou_span_a_displaced <= 0.031404 )
						ret := -0.421053
					if( senkou_span_a_displaced > 0.031404 )
						if( chinkou_span <= 0.033493 )
							if( chinkou_span <= 0.033476 )
								ret := 0.750000 // buy
							if( chinkou_span > 0.033476 )
								ret := -0.583333
						if( chinkou_span > 0.033493 )
							if( basis_max <= -6.9e-05 )
								if( basis_minus <= 0.000539 )
									ret := 0.365385
								if( basis_minus > 0.000539 )
									ret := 1.000000 // buy
							if( basis_max > -6.9e-05 )
								if( chinkou_span <= 0.033532 )
									ret := 0.928571 // buy
								if( chinkou_span > 0.033532 )
									ret := 1.000000 // buy
				if( tenkan_sen > 0.033972 )
					if( chinkou_span <= 0.035355 )
						if( senkou_span_b_displaced <= 0.03232 )
							if( tenkan_sen <= 0.034439 )
								ret := -0.333333
							if( tenkan_sen > 0.034439 )
								if( senkou_span_a <= 0.034244 )
									ret := 1.000000 // buy
								if( senkou_span_a > 0.034244 )
									ret := 0.500000
						if( senkou_span_b_displaced > 0.03232 )
							if( senkou_span_b <= 0.035395 )
								if( senkou_span_a <= 0.035449 )
									ret := -0.558824
								if( senkou_span_a > 0.035449 )
									ret := 0.137931
							if( senkou_span_b > 0.035395 )
								if( chinkou_span <= 0.034759 )
									ret := -0.461538
								if( chinkou_span > 0.034759 )
									ret := -0.899083 // sell
					if( chinkou_span > 0.035355 )
						if( chinkou_span <= 0.049159 )
							if( tenkan_sen <= 0.045215 )
								if( senkou_span_a_displaced <= 0.034676 )
									ret := 0.621495
								if( senkou_span_a_displaced > 0.034676 )
									ret := 0.004954
							if( tenkan_sen > 0.045215 )
								if( chinkou_span <= 0.045655 )
									ret := -0.645963
								if( chinkou_span > 0.045655 )
									ret := -0.131815
						if( chinkou_span > 0.049159 )
							if( basis_minus <= 0.000541 )
								if( tenkan_sen <= 0.047292 )
									ret := 0.944444 // buy
								if( tenkan_sen > 0.047292 )
									ret := 0.394737
							if( basis_minus > 0.000541 )
								if( senkou_span_b <= 0.047645 )
									ret := 0.606061
								if( senkou_span_b > 0.047645 )
									ret := -0.139053
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ichimoku_Cloud 
//@version=5
//indicator "Ichimoku Cloud", overlay=true)

// Input parameters for the Ichimoku Cloud
turning_periods = input.int(9, title="Tenkan-Sen Period")
standard_periods = input.int(26, title="Kinjun-Sen Period")
leading_span2_periods = input.int(52, title="Senkou Span B Period")
displacement = input.int(26, title="Displacement")

show_tenkan_sen = input.bool(true, title="Show Tenkan-Sen")
show_kinjun_sen = input.bool(true, title="Show Kinjun-Sen")
show_chinkou_span = input.bool(true, title="Show Chinkou Span")
show_cloud = input.bool(true, title="Show Cloud")
show_crosses = input.bool(false, title="Show Crosses")

// Donchian channel calculation
donchian(highs, lows, length) =>
    (ta.highest(highs, length) + ta.lowest(lows, length)) / 2

// Ichimoku calculations
tenkan_sen = donchian(high, low, turning_periods)
kinjun_sen = donchian(high, low, standard_periods)
senkou_span_a = (tenkan_sen + kinjun_sen) / 2
senkou_span_b = donchian(high, low, leading_span2_periods)

// Displaced Senkou Spans
senkou_span_a_displaced = senkou_span_a[displacement]
senkou_span_b_displaced = senkou_span_b[displacement]

// Chinkou Span
chinkou_span = close[displacement]

// Crosses
cross_up_tenkan_kinjun = ta.crossover(tenkan_sen, kinjun_sen)
cross_dn_tenkan_kinjun = ta.crossunder(tenkan_sen, kinjun_sen)
cross_up_tenkan_kinjunInt = cross_up_tenkan_kinjun ? 1 : 0  // Bool to int
cross_dn_tenkan_kinjunInt = cross_dn_tenkan_kinjun ? 1 : 0  // Bool to int

basis_minus = senkou_span_a - senkou_span_b
basis_max = senkou_span_a - tenkan_sen

// Plotting
plot(show_tenkan_sen ? tenkan_sen : na, color=color.lime, title="Tenkan-Sen", linewidth=1)
plot(show_kinjun_sen ? kinjun_sen : na, color=color.fuchsia, title="Kinjun-Sen", linewidth=1)
plot(show_chinkou_span ? chinkou_span : na, color=color.aqua, title="Chinkou Span", linewidth=1, offset=-displacement)

// Plot the Senkou Span lines and store the plot references
senkou_span_a_plot = plot(show_cloud ? senkou_span_a_displaced : na, color=color.green, title="Senkou Span A", linewidth=1)
senkou_span_b_plot = plot(show_cloud ? senkou_span_b_displaced : na, color=color.red, title="Senkou Span B", linewidth=1)

// Cloud filling
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.lime, 90), title="Bullish Cloud", transp=70, fillgaps=true)
fill(senkou_span_a_plot, senkou_span_b_plot, color=color.new(color.red, 90), title="Bearish Cloud", transp=70, fillgaps=true)

plotshape(series=(show_crosses and cross_up_tenkan_kinjun) ? close : na, location=location.belowbar, color=color.yellow, style=shape.triangleup, size=size.small, title="Cross Up Tenkan Kinjun")
plotshape(series=(show_crosses and cross_dn_tenkan_kinjun) ? close : na, location=location.abovebar, color=color.yellow, style=shape.triangledown, size=size.small, title="Cross Down Tenkan Kinjun")

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
float op_operation = decision_tree_0_VETUSDT_15Min_c3ebb68e(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)

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


