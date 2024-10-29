//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: DOTUSDT_5Min_1ICH_6640dc21 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_5Min_1ICH_6640dc21", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_5Min_6640dc21(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( chinkou_span <= 7.1528 )
		if( tenkan_sen <= 7.10233 )
			if( basis_minus <= -0.034366 )
				if( senkou_span_a <= 6.80633 )
					if( chinkou_span <= 6.59658 )
						if( kinjun_sen <= 6.59075 )
							if( basis_max <= 0.007509 )
								if( kinjun_sen <= 6.42509 )
									ret := 0.257724
								if( kinjun_sen > 6.42509 )
									ret := -0.326087
							if( basis_max > 0.007509 )
								if( chinkou_span <= 6.45181 )
									ret := 0.060502
								if( chinkou_span > 6.45181 )
									ret := 0.516556
						if( kinjun_sen > 6.59075 )
							if( kinjun_sen <= 6.656 )
								if( senkou_span_b_displaced <= 6.73789 )
									ret := -0.487179
								if( senkou_span_b_displaced > 6.73789 )
									ret := -0.978723 // sell
							if( kinjun_sen > 6.656 )
								if( basis_max <= 0.024166 )
									ret := -0.290323
								if( basis_max > 0.024166 )
									ret := 0.794118 // buy
					if( chinkou_span > 6.59658 )
						if( senkou_span_b <= 6.75742 )
							if( chinkou_span <= 6.6863 )
								if( senkou_span_b <= 6.54225 )
									ret := 0.835294 // buy
								if( senkou_span_b > 6.54225 )
									ret := 0.342857
							if( chinkou_span > 6.6863 )
								if( senkou_span_b <= 6.48199 )
									ret := -0.888889 // sell
								if( senkou_span_b > 6.48199 )
									ret := 0.729665 // buy
						if( senkou_span_b > 6.75742 )
							if( chinkou_span <= 6.72024 )
								if( basis_max <= 0.012094 )
									ret := -0.593220
								if( basis_max > 0.012094 )
									ret := -0.104478
							if( chinkou_span > 6.72024 )
								if( senkou_span_b_displaced <= 6.94623 )
									ret := 0.452012
								if( senkou_span_b_displaced > 6.94623 )
									ret := -0.050847
				if( senkou_span_a > 6.80633 )
					if( chinkou_span <= 6.886 )
						if( tenkan_sen <= 6.81759 )
							if( senkou_span_b_displaced <= 6.98903 )
								if( senkou_span_b_displaced <= 6.89332 )
									ret := 0.666667
								if( senkou_span_b_displaced > 6.89332 )
									ret := -0.313433
							if( senkou_span_b_displaced > 6.98903 )
								if( senkou_span_b_displaced <= 7.06225 )
									ret := 0.918919 // buy
								if( senkou_span_b_displaced > 7.06225 )
									ret := -0.400000
						if( tenkan_sen > 6.81759 )
							if( senkou_span_a_displaced <= 7.08715 )
								if( senkou_span_a_displaced <= 6.90836 )
									ret := 0.045455
								if( senkou_span_a_displaced > 6.90836 )
									ret := -0.614815
							if( senkou_span_a_displaced > 7.08715 )
								if( senkou_span_b_displaced <= 7.16588 )
									ret := 0.050420
								if( senkou_span_b_displaced > 7.16588 )
									ret := -0.928571 // sell
					if( chinkou_span > 6.886 )
						if( senkou_span_a <= 6.99939 )
							if( basis_max <= 0.017576 )
								if( senkou_span_a_displaced <= 7.06153 )
									ret := 0.417293
								if( senkou_span_a_displaced > 7.06153 )
									ret := 0.000000
							if( basis_max > 0.017576 )
								if( tenkan_sen <= 6.905 )
									ret := 0.437500
								if( tenkan_sen > 6.905 )
									ret := 0.833333 // buy
						if( senkou_span_a > 6.99939 )
							if( senkou_span_b_displaced <= 7.1435 )
								if( kinjun_sen <= 7.03446 )
									ret := -0.105263
								if( kinjun_sen > 7.03446 )
									ret := -0.830769 // sell
							if( senkou_span_b_displaced > 7.1435 )
								if( chinkou_span <= 6.956 )
									ret := -0.882353 // sell
								if( chinkou_span > 6.956 )
									ret := 0.165000
			if( basis_minus > -0.034366 )
				if( chinkou_span <= 7.07437 )
					if( kinjun_sen <= 6.99293 )
						if( tenkan_sen <= 4.01517 )
							if( chinkou_span <= 3.90216 )
								if( kinjun_sen <= 3.86356 )
									ret := 0.038652
								if( kinjun_sen > 3.86356 )
									ret := -0.466667
							if( chinkou_span > 3.90216 )
								if( chinkou_span <= 4.02711 )
									ret := 0.203838
								if( chinkou_span > 4.02711 )
									ret := 0.545455
						if( tenkan_sen > 4.01517 )
							if( chinkou_span <= 4.02878 )
								if( tenkan_sen <= 4.05252 )
									ret := -0.185609
								if( tenkan_sen > 4.05252 )
									ret := -0.611111
							if( chinkou_span > 4.02878 )
								if( tenkan_sen <= 4.15249 )
									ret := 0.117301
								if( tenkan_sen > 4.15249 )
									ret := 0.026231
					if( kinjun_sen > 6.99293 )
						if( chinkou_span <= 6.96755 )
							if( senkou_span_a <= 7.10382 )
								if( senkou_span_b <= 7.05396 )
									ret := -0.439791
								if( senkou_span_b > 7.05396 )
									ret := -0.812903 // sell
							if( senkou_span_a > 7.10382 )
								if( senkou_span_a <= 7.11165 )
									ret := 1.000000 // buy
								if( senkou_span_a > 7.11165 )
									ret := 0.285714
						if( chinkou_span > 6.96755 )
							if( senkou_span_a <= 7.02837 )
								if( kinjun_sen <= 7.01751 )
									ret := -0.099609
								if( kinjun_sen > 7.01751 )
									ret := 0.365314
							if( senkou_span_a > 7.02837 )
								if( kinjun_sen <= 7.10667 )
									ret := -0.296842
								if( kinjun_sen > 7.10667 )
									ret := 0.606061
				if( chinkou_span > 7.07437 )
					if( tenkan_sen <= 6.98953 )
						if( kinjun_sen <= 6.99316 )
							if( senkou_span_b_displaced <= 6.7484 )
								ret := 0.250000
							if( senkou_span_b_displaced > 6.7484 )
								if( kinjun_sen <= 6.72213 )
									ret := 0.500000
								if( kinjun_sen > 6.72213 )
									ret := 0.905172 // buy
						if( kinjun_sen > 6.99316 )
							if( basis_minus <= -0.013875 )
								ret := 1.000000 // buy
							if( basis_minus > -0.013875 )
								if( basis_max <= 0.0125 )
									ret := 0.000000
								if( basis_max > 0.0125 )
									ret := 0.250000
					if( tenkan_sen > 6.98953 )
						if( senkou_span_b_displaced <= 6.91648 )
							if( senkou_span_a_displaced <= 6.92961 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 6.92961 )
								if( senkou_span_b_displaced <= 6.90703 )
									ret := 0.714286 // buy
								if( senkou_span_b_displaced > 6.90703 )
									ret := 1.000000 // buy
						if( senkou_span_b_displaced > 6.91648 )
							if( basis_minus <= -0.006875 )
								if( senkou_span_b <= 7.08565 )
									ret := 0.619883
								if( senkou_span_b > 7.08565 )
									ret := 0.205556
							if( basis_minus > -0.006875 )
								if( senkou_span_a_displaced <= 6.91137 )
									ret := -0.764706 // sell
								if( senkou_span_a_displaced > 6.91137 )
									ret := 0.079585
		if( tenkan_sen > 7.10233 )
			if( tenkan_sen <= 7.2265 )
				if( chinkou_span <= 7.11889 )
					if( senkou_span_b <= 7.25863 )
						if( kinjun_sen <= 7.13875 )
							if( chinkou_span <= 6.99095 )
								if( tenkan_sen <= 7.11089 )
									ret := -0.615385
								if( tenkan_sen > 7.11089 )
									ret := -0.878378 // sell
							if( chinkou_span > 6.99095 )
								if( kinjun_sen <= 7.11072 )
									ret := -0.414634
								if( kinjun_sen > 7.11072 )
									ret := -0.077821
						if( kinjun_sen > 7.13875 )
							if( senkou_span_b_displaced <= 6.94828 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 6.94828 )
								if( kinjun_sen <= 7.2291 )
									ret := -0.606357
								if( kinjun_sen > 7.2291 )
									ret := -0.019608
					if( senkou_span_b > 7.25863 )
						if( senkou_span_a_displaced <= 7.30807 )
							ret := -0.400000
						if( senkou_span_a_displaced > 7.30807 )
							if( basis_minus <= -0.103734 )
								ret := 0.000000
							if( basis_minus > -0.103734 )
								if( senkou_span_a <= 7.22375 )
									ret := 1.000000 // buy
								if( senkou_span_a > 7.22375 )
									ret := 0.285714
				if( chinkou_span > 7.11889 )
					if( basis_minus <= -0.03991 )
						if( tenkan_sen <= 7.14775 )
							if( basis_max <= 0.028125 )
								ret := -1.000000 // sell
							if( basis_max > 0.028125 )
								ret := -0.800000 // sell
						if( tenkan_sen > 7.14775 )
							if( senkou_span_b <= 7.22651 )
								if( senkou_span_b_displaced <= 7.22424 )
									ret := 0.750000 // buy
								if( senkou_span_b_displaced > 7.22424 )
									ret := -0.166667
							if( senkou_span_b > 7.22651 )
								if( senkou_span_a_displaced <= 7.32613 )
									ret := -0.937500 // sell
								if( senkou_span_a_displaced > 7.32613 )
									ret := -0.277778
					if( basis_minus > -0.03991 )
						if( senkou_span_b_displaced <= 7.06539 )
							if( basis_minus <= 0.154508 )
								if( senkou_span_b_displaced <= 6.97743 )
									ret := -0.844444 // sell
								if( senkou_span_b_displaced > 6.97743 )
									ret := -0.352941
							if( basis_minus > 0.154508 )
								ret := 1.000000 // buy
						if( senkou_span_b_displaced > 7.06539 )
							if( kinjun_sen <= 7.1677 )
								if( senkou_span_b <= 7.16134 )
									ret := 0.119691
								if( senkou_span_b > 7.16134 )
									ret := 0.711111 // buy
							if( kinjun_sen > 7.1677 )
								if( senkou_span_a <= 7.21662 )
									ret := -0.265487
								if( senkou_span_a > 7.21662 )
									ret := 0.212121
			if( tenkan_sen > 7.2265 )
				if( senkou_span_a <= 7.38638 )
					if( chinkou_span <= 7.08473 )
						if( kinjun_sen <= 7.3775 )
							if( tenkan_sen <= 7.31625 )
								if( basis_minus <= -0.001967 )
									ret := -0.976744 // sell
								if( basis_minus > -0.001967 )
									ret := -0.841463 // sell
							if( tenkan_sen > 7.31625 )
								if( senkou_span_a_displaced <= 7.44559 )
									ret := 0.250000
								if( senkou_span_a_displaced > 7.44559 )
									ret := -1.000000 // sell
						if( kinjun_sen > 7.3775 )
							ret := 0.000000
					if( chinkou_span > 7.08473 )
						if( senkou_span_a <= 7.37107 )
							if( basis_max <= 0.031818 )
								if( basis_max <= 0.004518 )
									ret := -0.519608
								if( basis_max > 0.004518 )
									ret := -0.172840
							if( basis_max > 0.031818 )
								if( senkou_span_a_displaced <= 7.48447 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 7.48447 )
									ret := -0.750000 // sell
						if( senkou_span_a > 7.37107 )
							ret := 0.857143 // buy
				if( senkou_span_a > 7.38638 )
					if( senkou_span_b <= 8.199 )
						if( chinkou_span <= 6.90423 )
							if( chinkou_span <= 6.89571 )
								ret := -1.000000 // sell
							if( chinkou_span > 6.89571 )
								ret := -0.750000 // sell
						if( chinkou_span > 6.90423 )
							ret := -1.000000 // sell
					if( senkou_span_b > 8.199 )
						ret := 0.142857
	if( chinkou_span > 7.1528 )
		if( tenkan_sen <= 7.17095 )
			if( basis_minus <= 0.165086 )
				if( senkou_span_a <= 7.05785 )
					if( basis_minus <= 0.073769 )
						if( chinkou_span <= 7.20653 )
							if( senkou_span_a_displaced <= 6.72302 )
								ret := 0.250000
							if( senkou_span_a_displaced > 6.72302 )
								if( tenkan_sen <= 6.95375 )
									ret := 0.970000 // buy
								if( tenkan_sen > 6.95375 )
									ret := 0.806780 // buy
						if( chinkou_span > 7.20653 )
							if( senkou_span_a_displaced <= 6.96775 )
								if( senkou_span_b_displaced <= 6.812 )
									ret := 0.787234 // buy
								if( senkou_span_b_displaced > 6.812 )
									ret := 0.029412
							if( senkou_span_a_displaced > 6.96775 )
								if( basis_minus <= 0.0075 )
									ret := 0.547619
								if( basis_minus > 0.0075 )
									ret := 0.960000 // buy
					if( basis_minus > 0.073769 )
						if( chinkou_span <= 7.18224 )
							if( basis_max <= -0.02725 )
								ret := -0.857143 // sell
							if( basis_max > -0.02725 )
								ret := -0.200000
						if( chinkou_span > 7.18224 )
							if( basis_minus <= 0.077375 )
								ret := 0.750000 // buy
							if( basis_minus > 0.077375 )
								ret := 1.000000 // buy
				if( senkou_span_a > 7.05785 )
					if( chinkou_span <= 7.2112 )
						if( senkou_span_b_displaced <= 7.15325 )
							if( basis_max <= 0.010141 )
								if( senkou_span_b <= 7.0355 )
									ret := 0.701149 // buy
								if( senkou_span_b > 7.0355 )
									ret := 0.205761
							if( basis_max > 0.010141 )
								if( senkou_span_b_displaced <= 7.1026 )
									ret := 0.333333
								if( senkou_span_b_displaced > 7.1026 )
									ret := -0.860465 // sell
						if( senkou_span_b_displaced > 7.15325 )
							if( senkou_span_b <= 7.20423 )
								if( basis_max <= 0.002295 )
									ret := 0.257353
								if( basis_max > 0.002295 )
									ret := 0.724444 // buy
							if( senkou_span_b > 7.20423 )
								if( senkou_span_b <= 7.20475 )
									ret := -0.800000 // sell
								if( senkou_span_b > 7.20475 )
									ret := 0.234568
					if( chinkou_span > 7.2112 )
						if( basis_max <= 0.09833 )
							if( chinkou_span <= 7.29901 )
								if( senkou_span_a <= 7.1295 )
									ret := 0.734177 // buy
								if( senkou_span_a > 7.1295 )
									ret := 0.481728
							if( chinkou_span > 7.29901 )
								if( basis_minus <= 0.072625 )
									ret := 0.875862 // buy
								if( basis_minus > 0.072625 )
									ret := 0.272727
						if( basis_max > 0.09833 )
							ret := -1.000000 // sell
			if( basis_minus > 0.165086 )
				if( tenkan_sen <= 7.12881 )
					ret := -0.750000 // sell
				if( tenkan_sen > 7.12881 )
					ret := -1.000000 // sell
		if( tenkan_sen > 7.17095 )
			if( kinjun_sen <= 11.3141 )
				if( basis_max <= 1.2e-05 )
					if( senkou_span_a_displaced <= 7.16876 )
						if( kinjun_sen <= 7.13046 )
							if( basis_max <= -0.0466 )
								if( chinkou_span <= 7.2225 )
									ret := -0.750000 // sell
								if( chinkou_span > 7.2225 )
									ret := -1.000000 // sell
							if( basis_max > -0.0466 )
								if( chinkou_span <= 7.18838 )
									ret := 0.375000
								if( chinkou_span > 7.18838 )
									ret := -0.558824
						if( kinjun_sen > 7.13046 )
							if( chinkou_span <= 7.53305 )
								if( tenkan_sen <= 7.23691 )
									ret := 0.389474
								if( tenkan_sen > 7.23691 )
									ret := -0.135135
							if( chinkou_span > 7.53305 )
								if( senkou_span_a_displaced <= 7.11538 )
									ret := 0.105263
								if( senkou_span_a_displaced > 7.11538 )
									ret := 0.944444 // buy
					if( senkou_span_a_displaced > 7.16876 )
						if( chinkou_span <= 7.52287 )
							if( tenkan_sen <= 7.4546 )
								if( chinkou_span <= 7.36604 )
									ret := -0.085726
								if( chinkou_span > 7.36604 )
									ret := 0.185688
							if( tenkan_sen > 7.4546 )
								if( tenkan_sen <= 7.59918 )
									ret := -0.381127
								if( tenkan_sen > 7.59918 )
									ret := -0.813953 // sell
						if( chinkou_span > 7.52287 )
							if( senkou_span_b <= 7.50609 )
								if( senkou_span_a <= 7.59953 )
									ret := 0.479369
								if( senkou_span_a > 7.59953 )
									ret := -0.650000
							if( senkou_span_b > 7.50609 )
								if( chinkou_span <= 7.62345 )
									ret := -0.229808
								if( chinkou_span > 7.62345 )
									ret := 0.040218
				if( basis_max > 1.2e-05 )
					if( basis_minus <= -0.038337 )
						if( senkou_span_b <= 8.32225 )
							if( senkou_span_b_displaced <= 7.54094 )
								if( chinkou_span <= 7.2524 )
									ret := -0.266055
								if( chinkou_span > 7.2524 )
									ret := 0.250809
							if( senkou_span_b_displaced > 7.54094 )
								if( chinkou_span <= 8.16531 )
									ret := 0.275444
								if( chinkou_span > 8.16531 )
									ret := 0.692063
						if( senkou_span_b > 8.32225 )
							if( senkou_span_b_displaced <= 8.4475 )
								if( senkou_span_a <= 8.3 )
									ret := -0.181818
								if( senkou_span_a > 8.3 )
									ret := -0.790698 // sell
							if( senkou_span_b_displaced > 8.4475 )
								if( basis_max <= 0.047026 )
									ret := 0.110960
								if( basis_max > 0.047026 )
									ret := 0.376667
					if( basis_minus > -0.038337 )
						if( chinkou_span <= 7.2217 )
							if( tenkan_sen <= 7.20161 )
								if( basis_max <= 0.009254 )
									ret := 0.060000
								if( basis_max > 0.009254 )
									ret := 0.463415
							if( tenkan_sen > 7.20161 )
								if( senkou_span_b_displaced <= 7.28881 )
									ret := -0.139818
								if( senkou_span_b_displaced > 7.28881 )
									ret := -0.551136
						if( chinkou_span > 7.2217 )
							if( senkou_span_a <= 7.4174 )
								if( chinkou_span <= 7.38775 )
									ret := 0.154918
								if( chinkou_span > 7.38775 )
									ret := 0.605469
							if( senkou_span_a > 7.4174 )
								if( chinkou_span <= 7.46279 )
									ret := -0.390909
								if( chinkou_span > 7.46279 )
									ret := 0.080258
			if( kinjun_sen > 11.3141 )
				if( senkou_span_b_displaced <= 11.135 )
					if( kinjun_sen <= 11.4748 )
						if( senkou_span_b <= 11.3431 )
							ret := 1.000000 // buy
						if( senkou_span_b > 11.3431 )
							ret := 0.500000
					if( kinjun_sen > 11.4748 )
						ret := 0.000000
				if( senkou_span_b_displaced > 11.135 )
					if( basis_minus <= -0.108062 )
						if( senkou_span_a <= 11.3458 )
							ret := 0.500000
						if( senkou_span_a > 11.3458 )
							ret := 1.000000 // buy
					if( basis_minus > -0.108062 )
						if( kinjun_sen <= 11.6732 )
							if( chinkou_span <= 11.3796 )
								if( basis_max <= -0.074445 )
									ret := -0.250000
								if( basis_max > -0.074445 )
									ret := -0.889764 // sell
							if( chinkou_span > 11.3796 )
								if( chinkou_span <= 11.4717 )
									ret := 0.153846
								if( chinkou_span > 11.4717 )
									ret := -0.690909
						if( kinjun_sen > 11.6732 )
							if( senkou_span_b_displaced <= 11.4377 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 11.4377 )
								ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_DOTUSDT_5Min_6640dc21(senkou_span_a, basis_minus, chinkou_span, senkou_span_a_displaced, kinjun_sen, senkou_span_b_displaced, cross_up_tenkan_kinjunInt, senkou_span_b, cross_dn_tenkan_kinjunInt, tenkan_sen, basis_max)

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


