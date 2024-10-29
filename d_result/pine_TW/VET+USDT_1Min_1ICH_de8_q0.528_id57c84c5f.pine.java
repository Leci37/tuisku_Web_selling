//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: VETUSDT_1Min_1ICH_57c84c5f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_1Min_1ICH_57c84c5f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_1Min_57c84c5f(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_minus <= -0.000142 )
		if( basis_max <= -0.000122 )
			if( senkou_span_a <= 0.032142 )
				if( chinkou_span <= 0.02047 )
					ret := 0.500000
				if( chinkou_span > 0.02047 )
					ret := 1.000000 // buy
			if( senkou_span_a > 0.032142 )
				ret := 0.000000
		if( basis_max > -0.000122 )
			if( basis_max <= 0.000126 )
				if( chinkou_span <= 0.034815 )
					if( senkou_span_b <= 0.031656 )
						if( senkou_span_b_displaced <= 0.02381 )
							if( senkou_span_b_displaced <= 0.023613 )
								if( kinjun_sen <= 0.01937 )
									ret := -0.869565 // sell
								if( kinjun_sen > 0.01937 )
									ret := 0.134313
							if( senkou_span_b_displaced > 0.023613 )
								if( chinkou_span <= 0.023638 )
									ret := -0.562874
								if( chinkou_span > 0.023638 )
									ret := 0.531250
						if( senkou_span_b_displaced > 0.02381 )
							if( senkou_span_b <= 0.023824 )
								if( tenkan_sen <= 0.023464 )
									ret := 0.940000 // buy
								if( tenkan_sen > 0.023464 )
									ret := 0.608392
							if( senkou_span_b > 0.023824 )
								if( basis_max <= 8.7e-05 )
									ret := 0.250686
								if( basis_max > 8.7e-05 )
									ret := -0.179825
					if( senkou_span_b > 0.031656 )
						if( senkou_span_a <= 0.034733 )
							if( chinkou_span <= 0.031696 )
								if( tenkan_sen <= 0.03173 )
									ret := -0.407767
								if( tenkan_sen > 0.03173 )
									ret := -0.954545 // sell
							if( chinkou_span > 0.031696 )
								if( kinjun_sen <= 0.03269 )
									ret := 0.249097
								if( kinjun_sen > 0.03269 )
									ret := -0.185841
						if( senkou_span_a > 0.034733 )
							if( tenkan_sen <= 0.034714 )
								ret := 0.500000
							if( tenkan_sen > 0.034714 )
								if( senkou_span_b <= 0.035154 )
									ret := -0.802632 // sell
								if( senkou_span_b > 0.035154 )
									ret := -0.250000
				if( chinkou_span > 0.034815 )
					if( senkou_span_b <= 0.035849 )
						if( basis_minus <= -0.000178 )
							if( basis_max <= -0 )
								ret := 1.000000 // buy
							if( basis_max > -0 )
								if( basis_minus <= -0.000212 )
									ret := 0.619048
								if( basis_minus > -0.000212 )
									ret := 0.942857 // buy
						if( basis_minus > -0.000178 )
							if( basis_minus <= -0.000149 )
								if( senkou_span_a <= 0.035422 )
									ret := 0.438095
								if( senkou_span_a > 0.035422 )
									ret := -0.555556
							if( basis_minus > -0.000149 )
								if( basis_minus <= -0.000144 )
									ret := 0.892857 // buy
								if( basis_minus > -0.000144 )
									ret := 0.611111
					if( senkou_span_b > 0.035849 )
						if( kinjun_sen <= 0.036735 )
							if( chinkou_span <= 0.03552 )
								if( basis_max <= 7e-06 )
									ret := 0.428571
								if( basis_max > 7e-06 )
									ret := -0.931034 // sell
							if( chinkou_span > 0.03552 )
								if( basis_minus <= -0.00024 )
									ret := 0.800000 // buy
								if( basis_minus > -0.00024 )
									ret := 0.282158
						if( kinjun_sen > 0.036735 )
							if( senkou_span_b_displaced <= 0.037131 )
								ret := -1.000000 // sell
							if( senkou_span_b_displaced > 0.037131 )
								ret := -0.500000
			if( basis_max > 0.000126 )
				if( senkou_span_b_displaced <= 0.035364 )
					if( tenkan_sen <= 0.030813 )
						if( senkou_span_b_displaced <= 0.026394 )
							if( chinkou_span <= 0.020924 )
								if( senkou_span_b <= 0.021057 )
									ret := 0.735849 // buy
								if( senkou_span_b > 0.021057 )
									ret := -0.322581
							if( chinkou_span > 0.020924 )
								if( chinkou_span <= 0.023878 )
									ret := 1.000000 // buy
								if( chinkou_span > 0.023878 )
									ret := 0.800000 // buy
						if( senkou_span_b_displaced > 0.026394 )
							if( chinkou_span <= 0.02617 )
								if( basis_max <= 0.000151 )
									ret := -0.909091 // sell
								if( basis_max > 0.000151 )
									ret := -0.142857
							if( chinkou_span > 0.02617 )
								if( basis_minus <= -0.000275 )
									ret := 0.117647
								if( basis_minus > -0.000275 )
									ret := 0.696970
					if( tenkan_sen > 0.030813 )
						if( chinkou_span <= 0.034564 )
							ret := 1.000000 // buy
						if( chinkou_span > 0.034564 )
							ret := 0.750000 // buy
				if( senkou_span_b_displaced > 0.035364 )
					if( chinkou_span <= 0.03399 )
						ret := -1.000000 // sell
					if( chinkou_span > 0.03399 )
						if( senkou_span_a <= 0.035586 )
							if( basis_minus <= -0.000197 )
								if( chinkou_span <= 0.035884 )
									ret := 0.500000
								if( chinkou_span > 0.035884 )
									ret := 0.750000 // buy
							if( basis_minus > -0.000197 )
								ret := 1.000000 // buy
						if( senkou_span_a > 0.035586 )
							ret := 0.142857
	if( basis_minus > -0.000142 )
		if( kinjun_sen <= 0.022764 )
			if( chinkou_span <= 0.0227 )
				if( tenkan_sen <= 0.022646 )
					if( chinkou_span <= 0.02259 )
						if( senkou_span_a <= 0.022481 )
							if( senkou_span_b <= 0.019475 )
								if( senkou_span_b_displaced <= 0.019587 )
									ret := 0.949153 // buy
								if( senkou_span_b_displaced > 0.019587 )
									ret := 0.250000
							if( senkou_span_b > 0.019475 )
								if( tenkan_sen <= 0.019702 )
									ret := -0.455399
								if( tenkan_sen > 0.019702 )
									ret := 0.060052
						if( senkou_span_a > 0.022481 )
							if( chinkou_span <= 0.022439 )
								if( senkou_span_b <= 0.022417 )
									ret := -0.894737 // sell
								if( senkou_span_b > 0.022417 )
									ret := -0.317291
							if( chinkou_span > 0.022439 )
								if( basis_max <= 4.1e-05 )
									ret := -0.097151
								if( basis_max > 4.1e-05 )
									ret := 0.680851
					if( chinkou_span > 0.02259 )
						if( tenkan_sen <= 0.02247 )
							if( senkou_span_b_displaced <= 0.022679 )
								if( senkou_span_a_displaced <= 0.021879 )
									ret := -0.500000
								if( senkou_span_a_displaced > 0.021879 )
									ret := 0.843137 // buy
							if( senkou_span_b_displaced > 0.022679 )
								ret := -0.857143 // sell
						if( tenkan_sen > 0.02247 )
							if( basis_minus <= -4.3e-05 )
								if( senkou_span_a_displaced <= 0.022573 )
									ret := -0.923077 // sell
								if( senkou_span_a_displaced > 0.022573 )
									ret := 0.570388
							if( basis_minus > -4.3e-05 )
								if( senkou_span_b <= 0.022574 )
									ret := 0.359948
								if( senkou_span_b > 0.022574 )
									ret := 0.144960
				if( tenkan_sen > 0.022646 )
					if( kinjun_sen <= 0.022695 )
						if( senkou_span_a <= 0.022669 )
							if( basis_minus <= 0.000309 )
								if( basis_minus <= 0.000151 )
									ret := -0.190578
								if( basis_minus > 0.000151 )
									ret := -0.781818 // sell
							if( basis_minus > 0.000309 )
								if( senkou_span_a_displaced <= 0.022225 )
									ret := 0.500000
								if( senkou_span_a_displaced > 0.022225 )
									ret := 1.000000 // buy
						if( senkou_span_a > 0.022669 )
							if( senkou_span_a_displaced <= 0.022485 )
								if( senkou_span_a_displaced <= 0.022482 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.022482 )
									ret := 0.250000
							if( senkou_span_a_displaced > 0.022485 )
								if( chinkou_span <= 0.02255 )
									ret := -0.750000 // sell
								if( chinkou_span > 0.02255 )
									ret := -0.435013
					if( kinjun_sen > 0.022695 )
						if( chinkou_span <= 0.022639 )
							if( senkou_span_b_displaced <= 0.02262 )
								if( senkou_span_b_displaced <= 0.022559 )
									ret := -0.928571 // sell
								if( senkou_span_b_displaced > 0.022559 )
									ret := 0.558824
							if( senkou_span_b_displaced > 0.02262 )
								if( senkou_span_b <= 0.02275 )
									ret := -0.541176
								if( senkou_span_b > 0.02275 )
									ret := -0.263158
						if( chinkou_span > 0.022639 )
							if( senkou_span_b <= 0.022703 )
								if( basis_max <= -5e-06 )
									ret := -0.125000
								if( basis_max > -5e-06 )
									ret := 0.567164
							if( senkou_span_b > 0.022703 )
								if( senkou_span_a_displaced <= 0.022661 )
									ret := -0.750000 // sell
								if( senkou_span_a_displaced > 0.022661 )
									ret := 0.029148
			if( chinkou_span > 0.0227 )
				if( tenkan_sen <= 0.02271 )
					if( senkou_span_b <= 0.022426 )
						if( senkou_span_a <= 0.022593 )
							if( basis_max <= -0.000116 )
								ret := -0.500000
							if( basis_max > -0.000116 )
								if( chinkou_span <= 0.022711 )
									ret := 0.142857
								if( chinkou_span > 0.022711 )
									ret := 0.903226 // buy
						if( senkou_span_a > 0.022593 )
							if( senkou_span_a_displaced <= 0.022395 )
								ret := -0.500000
							if( senkou_span_a_displaced > 0.022395 )
								ret := 0.000000
					if( senkou_span_b > 0.022426 )
						if( tenkan_sen <= 0.022456 )
							if( basis_max <= 3.1e-05 )
								if( senkou_span_b <= 0.022491 )
									ret := 0.200000
								if( senkou_span_b > 0.022491 )
									ret := -0.935484 // sell
							if( basis_max > 3.1e-05 )
								if( basis_max <= 4.1e-05 )
									ret := 0.750000 // buy
								if( basis_max > 4.1e-05 )
									ret := 1.000000 // buy
						if( tenkan_sen > 0.022456 )
							if( basis_max <= 2e-05 )
								if( chinkou_span <= 0.02284 )
									ret := 0.349437
								if( chinkou_span > 0.02284 )
									ret := 0.669565
							if( basis_max > 2e-05 )
								if( senkou_span_a <= 0.022649 )
									ret := 0.836842 // buy
								if( senkou_span_a > 0.022649 )
									ret := 0.578059
				if( tenkan_sen > 0.02271 )
					if( senkou_span_a_displaced <= 0.022768 )
						if( basis_minus <= 9.2e-05 )
							if( chinkou_span <= 0.02294 )
								if( tenkan_sen <= 0.02277 )
									ret := 0.120507
								if( tenkan_sen > 0.02277 )
									ret := -0.163880
							if( chinkou_span > 0.02294 )
								if( tenkan_sen <= 0.02275 )
									ret := 0.523810
								if( tenkan_sen > 0.02275 )
									ret := 0.931818 // buy
						if( basis_minus > 9.2e-05 )
							if( tenkan_sen <= 0.022873 )
								if( chinkou_span <= 0.022954 )
									ret := 0.629870
								if( chinkou_span > 0.022954 )
									ret := -0.115385
							if( tenkan_sen > 0.022873 )
								if( basis_minus <= 0.00018 )
									ret := 0.250000
								if( basis_minus > 0.00018 )
									ret := -0.727273 // sell
					if( senkou_span_a_displaced > 0.022768 )
						if( chinkou_span <= 0.0228 )
							if( chinkou_span <= 0.022744 )
								if( senkou_span_b_displaced <= 0.022792 )
									ret := 0.729730 // buy
								if( senkou_span_b_displaced > 0.022792 )
									ret := 0.347826
							if( chinkou_span > 0.022744 )
								if( senkou_span_a_displaced <= 0.022898 )
									ret := 0.196429
								if( senkou_span_a_displaced > 0.022898 )
									ret := -0.846154 // sell
						if( chinkou_span > 0.0228 )
							if( senkou_span_b_displaced <= 0.022903 )
								if( senkou_span_a <= 0.02276 )
									ret := 0.738397 // buy
								if( senkou_span_a > 0.02276 )
									ret := 0.289474
							if( senkou_span_b_displaced > 0.022903 )
								if( kinjun_sen <= 0.022699 )
									ret := 0.681818
								if( kinjun_sen > 0.022699 )
									ret := -0.102564
		if( kinjun_sen > 0.022764 )
			if( chinkou_span <= 0.022815 )
				if( tenkan_sen <= 0.022845 )
					if( chinkou_span <= 0.022667 )
						if( senkou_span_b <= 0.022858 )
							if( basis_max <= 4.9e-05 )
								if( senkou_span_a_displaced <= 0.022957 )
									ret := -0.600719
								if( senkou_span_a_displaced > 0.022957 )
									ret := 0.400000
							if( basis_max > 4.9e-05 )
								if( senkou_span_a_displaced <= 0.022874 )
									ret := 1.000000 // buy
								if( senkou_span_a_displaced > 0.022874 )
									ret := -0.666667
						if( senkou_span_b > 0.022858 )
							if( chinkou_span <= 0.022301 )
								if( senkou_span_b <= 0.022911 )
									ret := -0.333333
								if( senkou_span_b > 0.022911 )
									ret := -0.928571 // sell
							if( chinkou_span > 0.022301 )
								if( basis_minus <= -0.000135 )
									ret := -0.875000 // sell
								if( basis_minus > -0.000135 )
									ret := 0.375000
					if( chinkou_span > 0.022667 )
						if( chinkou_span <= 0.0228 )
							if( tenkan_sen <= 0.02277 )
								if( senkou_span_b <= 0.022763 )
									ret := -0.378378
								if( senkou_span_b > 0.022763 )
									ret := 0.035806
							if( tenkan_sen > 0.02277 )
								if( senkou_span_a_displaced <= 0.022693 )
									ret := 0.419355
								if( senkou_span_a_displaced > 0.022693 )
									ret := -0.287694
						if( chinkou_span > 0.0228 )
							if( senkou_span_b <= 0.022833 )
								if( tenkan_sen <= 0.022831 )
									ret := 0.258824
								if( tenkan_sen > 0.022831 )
									ret := -0.387097
							if( senkou_span_b > 0.022833 )
								if( basis_max <= 1.2e-05 )
									ret := -0.390625
								if( basis_max > 1.2e-05 )
									ret := 0.150000
				if( tenkan_sen > 0.022845 )
					if( chinkou_span <= 0.022699 )
						if( senkou_span_a_displaced <= 0.023536 )
							if( senkou_span_b_displaced <= 0.022625 )
								ret := 0.200000
							if( senkou_span_b_displaced > 0.022625 )
								if( senkou_span_b <= 0.022952 )
									ret := -0.612121
								if( senkou_span_b > 0.022952 )
									ret := -0.850932 // sell
						if( senkou_span_a_displaced > 0.023536 )
							if( chinkou_span <= 0.022668 )
								ret := 1.000000 // buy
							if( chinkou_span > 0.022668 )
								ret := -0.750000 // sell
					if( chinkou_span > 0.022699 )
						if( tenkan_sen <= 0.02301 )
							if( basis_max <= 4.1e-05 )
								if( basis_max <= -2.5e-05 )
									ret := -0.634783
								if( basis_max > -2.5e-05 )
									ret := -0.380187
							if( basis_max > 4.1e-05 )
								if( basis_minus <= -0.0001 )
									ret := 1.000000 // buy
								if( basis_minus > -0.0001 )
									ret := 0.000000
						if( tenkan_sen > 0.02301 )
							if( senkou_span_b <= 0.023142 )
								if( senkou_span_b_displaced <= 0.022666 )
									ret := -0.450000
								if( senkou_span_b_displaced > 0.022666 )
									ret := -0.902439 // sell
							if( senkou_span_b > 0.023142 )
								if( tenkan_sen <= 0.023095 )
									ret := 0.750000 // buy
								if( tenkan_sen > 0.023095 )
									ret := -0.763158 // sell
			if( chinkou_span > 0.022815 )
				if( tenkan_sen <= 0.02288 )
					if( chinkou_span <= 0.02287 )
						if( tenkan_sen <= 0.02284 )
							if( senkou_span_a_displaced <= 0.022837 )
								if( basis_max <= 3e-06 )
									ret := 0.180851
								if( basis_max > 3e-06 )
									ret := 0.458937
							if( senkou_span_a_displaced > 0.022837 )
								if( senkou_span_b <= 0.022811 )
									ret := 0.615385
								if( senkou_span_b > 0.022811 )
									ret := -0.005917
						if( tenkan_sen > 0.02284 )
							if( basis_max <= 2e-05 )
								if( basis_max <= 1.5e-05 )
									ret := -0.117225
								if( basis_max > 1.5e-05 )
									ret := -0.900000 // sell
							if( basis_max > 2e-05 )
								if( chinkou_span <= 0.022865 )
									ret := 0.714286 // buy
								if( chinkou_span > 0.022865 )
									ret := -1.000000 // sell
					if( chinkou_span > 0.02287 )
						if( senkou_span_b_displaced <= 0.022622 )
							if( senkou_span_b_displaced <= 0.022543 )
								if( senkou_span_a_displaced <= 0.022551 )
									ret := 0.800000 // buy
								if( senkou_span_a_displaced > 0.022551 )
									ret := -0.200000
							if( senkou_span_b_displaced > 0.022543 )
								if( senkou_span_b_displaced <= 0.022571 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 0.022571 )
									ret := -0.352941
						if( senkou_span_b_displaced > 0.022622 )
							if( kinjun_sen <= 0.022896 )
								if( chinkou_span <= 0.023021 )
									ret := 0.423308
								if( chinkou_span > 0.023021 )
									ret := 0.650794
							if( kinjun_sen > 0.022896 )
								if( tenkan_sen <= 0.02283 )
									ret := 0.615385
								if( tenkan_sen > 0.02283 )
									ret := -0.236842
				if( tenkan_sen > 0.02288 )
					if( chinkou_span <= 0.022962 )
						if( senkou_span_a <= 0.022968 )
							if( tenkan_sen <= 0.022963 )
								if( kinjun_sen <= 0.022859 )
									ret := -0.426901
								if( kinjun_sen > 0.022859 )
									ret := 0.016858
							if( tenkan_sen > 0.022963 )
								if( senkou_span_b_displaced <= 0.022453 )
									ret := -0.944444 // sell
								if( senkou_span_b_displaced > 0.022453 )
									ret := -0.417476
						if( senkou_span_a > 0.022968 )
							if( senkou_span_b <= 0.022945 )
								if( senkou_span_a <= 0.022979 )
									ret := -0.588235
								if( senkou_span_a > 0.022979 )
									ret := 0.275862
							if( senkou_span_b > 0.022945 )
								if( tenkan_sen <= 0.023039 )
									ret := -0.363239
								if( tenkan_sen > 0.023039 )
									ret := -0.608541
					if( chinkou_span > 0.022962 )
						if( tenkan_sen <= 0.023224 )
							if( chinkou_span <= 0.02321 )
								if( senkou_span_a <= 0.023005 )
									ret := 0.294821
								if( senkou_span_a > 0.023005 )
									ret := 0.006769
							if( chinkou_span > 0.02321 )
								if( chinkou_span <= 0.02327 )
									ret := 0.427885
								if( chinkou_span > 0.02327 )
									ret := 0.657328
						if( tenkan_sen > 0.023224 )
							if( chinkou_span <= 0.023323 )
								if( tenkan_sen <= 0.023321 )
									ret := -0.069219
								if( tenkan_sen > 0.023321 )
									ret := -0.442462
							if( chinkou_span > 0.023323 )
								if( senkou_span_b <= 0.023515 )
									ret := 0.221001
								if( senkou_span_b > 0.023515 )
									ret := 0.034607
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_VETUSDT_1Min_57c84c5f(basis_minus, senkou_span_b, cross_dn_tenkan_kinjunInt, cross_up_tenkan_kinjunInt, kinjun_sen, tenkan_sen, senkou_span_b_displaced, senkou_span_a, senkou_span_a_displaced, basis_max, chinkou_span)

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


