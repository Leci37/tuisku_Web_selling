//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: TWLO_15Min_1ICH_c8dbf43b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TWLO_15Min_1ICH_c8dbf43b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TWLO_15Min_c8dbf43b(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( senkou_span_b <= 70.8647 )
		if( senkou_span_b <= 28.7243 )
			if( basis_max <= -0.280138 )
				if( chinkou_span <= 30.0631 )
					if( senkou_span_b_displaced <= 29.8422 )
						if( tenkan_sen <= 25.0075 )
							ret := 1.000000 // buy
						if( tenkan_sen > 25.0075 )
							if( basis_minus <= 0.3025 )
								ret := 0.500000
							if( basis_minus > 0.3025 )
								ret := 0.000000
					if( senkou_span_b_displaced > 29.8422 )
						ret := 0.900000 // buy
				if( chinkou_span > 30.0631 )
					if( senkou_span_b <= 27.2778 )
						if( basis_minus <= 0.447241 )
							ret := 0.785714 // buy
						if( basis_minus > 0.447241 )
							ret := 1.000000 // buy
					if( senkou_span_b > 27.2778 )
						ret := 1.000000 // buy
			if( basis_max > -0.280138 )
				if( senkou_span_b_displaced <= 27.8774 )
					if( senkou_span_b_displaced <= 25.1999 )
						if( senkou_span_b_displaced <= 24.7766 )
							if( tenkan_sen <= 26.149 )
								if( basis_minus <= 0.5475 )
									ret := 0.000767
								if( basis_minus > 0.5475 )
									ret := 0.607843
							if( tenkan_sen > 26.149 )
								if( senkou_span_a_displaced <= 25.7204 )
									ret := 0.833333 // buy
								if( senkou_span_a_displaced > 25.7204 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 24.7766 )
							if( kinjun_sen <= 24.1746 )
								if( basis_minus <= -0.38125 )
									ret := 0.960784 // buy
								if( basis_minus > -0.38125 )
									ret := 0.720000 // buy
							if( kinjun_sen > 24.1746 )
								if( senkou_span_a <= 24.2477 )
									ret := -0.807692 // sell
								if( senkou_span_a > 24.2477 )
									ret := 0.327586
					if( senkou_span_b_displaced > 25.1999 )
						if( senkou_span_b <= 25.4565 )
							if( senkou_span_a <= 24.2174 )
								if( tenkan_sen <= 23.9771 )
									ret := 0.805556 // buy
								if( tenkan_sen > 23.9771 )
									ret := -0.333333
							if( senkou_span_a > 24.2174 )
								if( basis_minus <= -0.333248 )
									ret := -0.852174 // sell
								if( basis_minus > -0.333248 )
									ret := -0.288043
						if( senkou_span_b > 25.4565 )
							if( chinkou_span <= 24.8976 )
								if( senkou_span_b_displaced <= 26.21 )
									ret := -0.844444 // sell
								if( senkou_span_b_displaced > 26.21 )
									ret := -0.393939
							if( chinkou_span > 24.8976 )
								if( tenkan_sen <= 28.1858 )
									ret := 0.123051
								if( tenkan_sen > 28.1858 )
									ret := -0.527897
				if( senkou_span_b_displaced > 27.8774 )
					if( basis_max <= 0.448883 )
						if( tenkan_sen <= 25.4432 )
							if( senkou_span_a_displaced <= 26.2365 )
								if( senkou_span_a_displaced <= 25.5793 )
									ret := 0.818182 // buy
								if( senkou_span_a_displaced > 25.5793 )
									ret := 0.625000
							if( senkou_span_a_displaced > 26.2365 )
								ret := 1.000000 // buy
						if( tenkan_sen > 25.4432 )
							if( chinkou_span <= 27.9399 )
								if( basis_minus <= -2.47622 )
									ret := 1.000000 // buy
								if( basis_minus > -2.47622 )
									ret := -0.123457
							if( chinkou_span > 27.9399 )
								if( senkou_span_b <= 28.5049 )
									ret := 0.602222
								if( senkou_span_b > 28.5049 )
									ret := 0.166667
					if( basis_max > 0.448883 )
						if( senkou_span_a_displaced <= 29.1345 )
							if( senkou_span_a <= 27.6356 )
								ret := -0.384615
							if( senkou_span_a > 27.6356 )
								ret := -1.000000 // sell
						if( senkou_span_a_displaced > 29.1345 )
							if( basis_minus <= -1.18547 )
								ret := 0.578947
							if( basis_minus > -1.18547 )
								ret := -0.750000 // sell
		if( senkou_span_b > 28.7243 )
			if( senkou_span_b_displaced <= 27.9934 )
				if( senkou_span_a <= 30.6489 )
					if( senkou_span_a <= 29.1025 )
						if( senkou_span_b <= 28.799 )
							if( senkou_span_b <= 28.7422 )
								ret := -0.857143 // sell
							if( senkou_span_b > 28.7422 )
								ret := -1.000000 // sell
						if( senkou_span_b > 28.799 )
							ret := -0.500000
					if( senkou_span_a > 29.1025 )
						ret := -1.000000 // sell
				if( senkou_span_a > 30.6489 )
					if( basis_max <= -0.533274 )
						ret := -0.800000 // sell
					if( basis_max > -0.533274 )
						ret := -0.625000
			if( senkou_span_b_displaced > 27.9934 )
				if( kinjun_sen <= 70.8244 )
					if( basis_max <= -0.930012 )
						if( kinjun_sen <= 68.9437 )
							if( senkou_span_b_displaced <= 60.6486 )
								if( basis_minus <= 1.29067 )
									ret := -0.388889
								if( basis_minus > 1.29067 )
									ret := 0.616000
							if( senkou_span_b_displaced > 60.6486 )
								if( tenkan_sen <= 69.7575 )
									ret := 0.521739
								if( tenkan_sen > 69.7575 )
									ret := 0.956522 // buy
						if( kinjun_sen > 68.9437 )
							if( senkou_span_a <= 71.1916 )
								ret := -0.950000 // sell
							if( senkou_span_a > 71.1916 )
								if( senkou_span_b <= 70.5024 )
									ret := 0.818182 // buy
								if( senkou_span_b > 70.5024 )
									ret := 0.076923
					if( basis_max > -0.930012 )
						if( chinkou_span <= 68.5014 )
							if( senkou_span_a_displaced <= 66.5327 )
								if( chinkou_span <= 31.3092 )
									ret := -0.123219
								if( chinkou_span > 31.3092 )
									ret := 0.039409
							if( senkou_span_a_displaced > 66.5327 )
								if( senkou_span_a <= 63.8275 )
									ret := -0.829457 // sell
								if( senkou_span_a > 63.8275 )
									ret := -0.148747
						if( chinkou_span > 68.5014 )
							if( senkou_span_b <= 68.6723 )
								if( basis_max <= -0.148696 )
									ret := 0.346604
								if( basis_max > -0.148696 )
									ret := 0.699288
							if( senkou_span_b > 68.6723 )
								if( basis_max <= -0.014672 )
									ret := -0.120748
								if( basis_max > -0.014672 )
									ret := 0.370301
				if( kinjun_sen > 70.8244 )
					if( senkou_span_a <= 75.0114 )
						if( senkou_span_a_displaced <= 68.0169 )
							ret := -0.866667 // sell
						if( senkou_span_a_displaced > 68.0169 )
							if( senkou_span_b_displaced <= 66.3693 )
								ret := -0.666667
							if( senkou_span_b_displaced > 66.3693 )
								if( basis_minus <= 4.23509 )
									ret := 0.662207
								if( basis_minus > 4.23509 )
									ret := -0.181818
					if( senkou_span_a > 75.0114 )
						if( chinkou_span <= 78.0958 )
							ret := -0.900000 // sell
						if( chinkou_span > 78.0958 )
							ret := -1.000000 // sell
	if( senkou_span_b > 70.8647 )
		if( chinkou_span <= 72.0191 )
			if( tenkan_sen <= 71.8277 )
				if( kinjun_sen <= 72.0616 )
					if( senkou_span_a_displaced <= 71.8917 )
						if( tenkan_sen <= 71.2816 )
							if( basis_minus <= -0.448629 )
								if( senkou_span_a <= 69.9211 )
									ret := -0.788889 // sell
								if( senkou_span_a > 69.9211 )
									ret := -0.072165
							if( basis_minus > -0.448629 )
								if( kinjun_sen <= 70.8245 )
									ret := 0.272727
								if( kinjun_sen > 70.8245 )
									ret := -0.895652 // sell
						if( tenkan_sen > 71.2816 )
							if( senkou_span_b <= 71.7305 )
								if( senkou_span_b <= 71.635 )
									ret := -0.093023
								if( senkou_span_b > 71.635 )
									ret := 0.785714 // buy
							if( senkou_span_b > 71.7305 )
								ret := -0.588235
					if( senkou_span_a_displaced > 71.8917 )
						if( senkou_span_a_displaced <= 74.6021 )
							if( basis_max <= 0.944854 )
								if( basis_max <= 0.51375 )
									ret := 0.146179
								if( basis_max > 0.51375 )
									ret := -0.442308
							if( basis_max > 0.944854 )
								ret := 1.000000 // buy
						if( senkou_span_a_displaced > 74.6021 )
							ret := -1.000000 // sell
				if( kinjun_sen > 72.0616 )
					if( senkou_span_a <= 71.8697 )
						if( senkou_span_b <= 73.4062 )
							if( kinjun_sen <= 72.333 )
								if( senkou_span_b_displaced <= 72.7868 )
									ret := 0.526316
								if( senkou_span_b_displaced > 72.7868 )
									ret := 0.942308 // buy
							if( kinjun_sen > 72.333 )
								ret := 0.095238
						if( senkou_span_b > 73.4062 )
							ret := 1.000000 // buy
					if( senkou_span_a > 71.8697 )
						if( senkou_span_a_displaced <= 74.7496 )
							if( kinjun_sen <= 72.1693 )
								ret := 0.153846
							if( kinjun_sen > 72.1693 )
								if( senkou_span_b_displaced <= 73.0525 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 73.0525 )
									ret := -0.470588
						if( senkou_span_a_displaced > 74.7496 )
							if( senkou_span_b_displaced <= 77.99 )
								if( tenkan_sen <= 71.6589 )
									ret := 0.461538
								if( tenkan_sen > 71.6589 )
									ret := 0.153846
							if( senkou_span_b_displaced > 77.99 )
								ret := 1.000000 // buy
			if( tenkan_sen > 71.8277 )
				if( chinkou_span <= 69.58 )
					if( chinkou_span <= 69.1994 )
						if( kinjun_sen <= 72.294 )
							if( basis_max <= -0.351487 )
								ret := -0.666667
							if( basis_max > -0.351487 )
								if( basis_max <= -0.261964 )
									ret := -0.846154 // sell
								if( basis_max > -0.261964 )
									ret := -0.975610 // sell
						if( kinjun_sen > 72.294 )
							if( basis_max <= 0.556267 )
								ret := -1.000000 // sell
							if( basis_max > 0.556267 )
								ret := -0.909091 // sell
					if( chinkou_span > 69.1994 )
						if( basis_minus <= -1.00438 )
							ret := -0.210526
						if( basis_minus > -1.00438 )
							if( tenkan_sen <= 72.344 )
								ret := -0.875000 // sell
							if( tenkan_sen > 72.344 )
								ret := -1.000000 // sell
				if( chinkou_span > 69.58 )
					if( tenkan_sen <= 72.4854 )
						if( kinjun_sen <= 73.7291 )
							if( basis_minus <= -0.765337 )
								if( chinkou_span <= 70.43 )
									ret := -0.153846
								if( chinkou_span > 70.43 )
									ret := -0.795455 // sell
							if( basis_minus > -0.765337 )
								if( basis_max <= 0.052696 )
									ret := -0.037736
								if( basis_max > 0.052696 )
									ret := -0.404762
						if( kinjun_sen > 73.7291 )
							if( senkou_span_b_displaced <= 74.679 )
								ret := 0.333333
							if( senkou_span_b_displaced > 74.679 )
								if( basis_minus <= -1.03656 )
									ret := 0.785714 // buy
								if( basis_minus > -1.03656 )
									ret := 1.000000 // buy
					if( tenkan_sen > 72.4854 )
						if( basis_max <= 0.222053 )
							if( senkou_span_b <= 74.6275 )
								if( basis_max <= -0.321162 )
									ret := 0.083333
								if( basis_max > -0.321162 )
									ret := -0.775362 // sell
							if( senkou_span_b > 74.6275 )
								if( kinjun_sen <= 73.9973 )
									ret := -0.500000
								if( kinjun_sen > 73.9973 )
									ret := -0.915966 // sell
						if( basis_max > 0.222053 )
							if( chinkou_span <= 70.2705 )
								ret := 0.800000 // buy
							if( chinkou_span > 70.2705 )
								if( senkou_span_b <= 74.3275 )
									ret := 0.206897
								if( senkou_span_b > 74.3275 )
									ret := -0.532895
		if( chinkou_span > 72.0191 )
			if( chinkou_span <= 84.9315 )
				if( kinjun_sen <= 75 )
					if( chinkou_span <= 74.1164 )
						if( kinjun_sen <= 72.7238 )
							if( chinkou_span <= 72.7513 )
								if( chinkou_span <= 72.0856 )
									ret := 0.761905 // buy
								if( chinkou_span > 72.0856 )
									ret := -0.042254
							if( chinkou_span > 72.7513 )
								if( tenkan_sen <= 71.2958 )
									ret := 0.722222 // buy
								if( tenkan_sen > 71.2958 )
									ret := 0.291339
						if( kinjun_sen > 72.7238 )
							if( basis_max <= 0.05905 )
								if( senkou_span_a_displaced <= 72.9053 )
									ret := -0.632768
								if( senkou_span_a_displaced > 72.9053 )
									ret := -0.207792
							if( basis_max > 0.05905 )
								if( senkou_span_a_displaced <= 76.1963 )
									ret := -0.032258
								if( senkou_span_a_displaced > 76.1963 )
									ret := 0.454545
					if( chinkou_span > 74.1164 )
						if( basis_minus <= 1.48508 )
							if( senkou_span_a <= 72.4538 )
								if( senkou_span_b <= 72.7035 )
									ret := 0.784689 // buy
								if( senkou_span_b > 72.7035 )
									ret := -0.107143
							if( senkou_span_a > 72.4538 )
								if( basis_max <= 0.377397 )
									ret := 0.263270
								if( basis_max > 0.377397 )
									ret := 0.765714 // buy
						if( basis_minus > 1.48508 )
							if( senkou_span_b <= 72.8202 )
								if( kinjun_sen <= 73.9618 )
									ret := -0.127660
								if( kinjun_sen > 73.9618 )
									ret := 0.758621 // buy
							if( senkou_span_b > 72.8202 )
								if( tenkan_sen <= 75.4125 )
									ret := 0.083333
								if( tenkan_sen > 75.4125 )
									ret := -0.843750 // sell
				if( kinjun_sen > 75 )
					if( kinjun_sen <= 84.0825 )
						if( chinkou_span <= 76.7482 )
							if( tenkan_sen <= 76.0687 )
								if( senkou_span_a_displaced <= 80.647 )
									ret := -0.121212
								if( senkou_span_a_displaced > 80.647 )
									ret := -1.000000 // sell
							if( tenkan_sen > 76.0687 )
								if( basis_max <= -0.119233 )
									ret := -0.742857 // sell
								if( basis_max > -0.119233 )
									ret := -0.458401
						if( chinkou_span > 76.7482 )
							if( senkou_span_a_displaced <= 78.1711 )
								if( basis_minus <= 4.86108 )
									ret := 0.242210
								if( basis_minus > 4.86108 )
									ret := -0.793103 // sell
							if( senkou_span_a_displaced > 78.1711 )
								if( chinkou_span <= 80.8784 )
									ret := -0.228707
								if( chinkou_span > 80.8784 )
									ret := 0.090164
					if( kinjun_sen > 84.0825 )
						if( basis_max <= 0.496995 )
							if( kinjun_sen <= 86.9314 )
								if( tenkan_sen <= 87.1175 )
									ret := -0.506187
								if( tenkan_sen > 87.1175 )
									ret := -0.919355 // sell
							if( kinjun_sen > 86.9314 )
								if( senkou_span_b_displaced <= 87.0925 )
									ret := -0.270833
								if( senkou_span_b_displaced > 87.0925 )
									ret := -0.846847 // sell
						if( basis_max > 0.496995 )
							if( senkou_span_b <= 89.8515 )
								if( senkou_span_a <= 84.1097 )
									ret := -1.000000 // sell
								if( senkou_span_a > 84.1097 )
									ret := 0.349398
							if( senkou_span_b > 89.8515 )
								if( kinjun_sen <= 90.9609 )
									ret := -0.880597 // sell
								if( kinjun_sen > 90.9609 )
									ret := -0.200000
			if( chinkou_span > 84.9315 )
				if( senkou_span_b_displaced <= 89.321 )
					if( kinjun_sen <= 86.0992 )
						if( senkou_span_a <= 81.8406 )
							if( senkou_span_a_displaced <= 75.1545 )
								if( chinkou_span <= 87.1697 )
									ret := 0.107143
								if( chinkou_span > 87.1697 )
									ret := 0.819444 // buy
							if( senkou_span_a_displaced > 75.1545 )
								if( senkou_span_b_displaced <= 84.2168 )
									ret := 0.903509 // buy
								if( senkou_span_b_displaced > 84.2168 )
									ret := 0.250000
						if( senkou_span_a > 81.8406 )
							if( tenkan_sen <= 87.3735 )
								if( senkou_span_b_displaced <= 82.3259 )
									ret := 0.246073
								if( senkou_span_b_displaced > 82.3259 )
									ret := 0.535679
							if( tenkan_sen > 87.3735 )
								if( chinkou_span <= 87.9368 )
									ret := -0.472727
								if( chinkou_span > 87.9368 )
									ret := 0.694444
					if( kinjun_sen > 86.0992 )
						if( chinkou_span <= 89.0982 )
							if( tenkan_sen <= 87.16 )
								if( senkou_span_b <= 85.5739 )
									ret := -0.409091
								if( senkou_span_b > 85.5739 )
									ret := 0.205634
							if( tenkan_sen > 87.16 )
								if( senkou_span_a <= 86.8878 )
									ret := 0.384615
								if( senkou_span_a > 86.8878 )
									ret := -0.629428
						if( chinkou_span > 89.0982 )
							if( tenkan_sen <= 95.9114 )
								if( chinkou_span <= 96.6578 )
									ret := 0.356698
								if( chinkou_span > 96.6578 )
									ret := 0.765182 // buy
							if( tenkan_sen > 95.9114 )
								if( basis_max <= -1.1414 )
									ret := -0.543478
								if( basis_max > -1.1414 )
									ret := 0.045455
				if( senkou_span_b_displaced > 89.321 )
					if( senkou_span_b <= 431.825 )
						if( senkou_span_b_displaced <= 90.9399 )
							if( chinkou_span <= 92.2849 )
								if( basis_max <= 0.27707 )
									ret := -0.718519 // sell
								if( basis_max > 0.27707 )
									ret := 0.300000
							if( chinkou_span > 92.2849 )
								if( kinjun_sen <= 92.7572 )
									ret := -0.360000
								if( kinjun_sen > 92.7572 )
									ret := 0.312500
						if( senkou_span_b_displaced > 90.9399 )
							if( senkou_span_b_displaced <= 94.5936 )
								if( chinkou_span <= 91.0937 )
									ret := -0.362110
								if( chinkou_span > 91.0937 )
									ret := 0.366604
							if( senkou_span_b_displaced > 94.5936 )
								if( chinkou_span <= 97.6105 )
									ret := -0.260987
								if( chinkou_span > 97.6105 )
									ret := -0.007509
					if( senkou_span_b > 431.825 )
						if( tenkan_sen <= 457.345 )
							if( senkou_span_a_displaced <= 438.147 )
								if( senkou_span_a_displaced <= 430.145 )
									ret := 0.000000
								if( senkou_span_a_displaced > 430.145 )
									ret := -0.717949 // sell
							if( senkou_span_a_displaced > 438.147 )
								if( basis_max <= 1.6625 )
									ret := 0.173077
								if( basis_max > 1.6625 )
									ret := -0.541667
						if( tenkan_sen > 457.345 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_TWLO_15Min_c8dbf43b(senkou_span_a_displaced, cross_dn_tenkan_kinjunInt, kinjun_sen, chinkou_span, senkou_span_b_displaced, basis_minus, senkou_span_b, senkou_span_a, cross_up_tenkan_kinjunInt, tenkan_sen, basis_max)

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


