//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: BTCUSDT_30Min_1ICH_2baf712e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_30Min_1ICH_2baf712e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_30Min_2baf712e(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_minus <= -674.953 )
		if( senkou_span_a_displaced <= 39601.1 )
			if( chinkou_span <= 35268 )
				if( senkou_span_b <= 17817.2 )
					if( kinjun_sen <= 16800.7 )
						ret := 1.000000 // buy
					if( kinjun_sen > 16800.7 )
						if( senkou_span_a <= 16792.8 )
							ret := 0.250000
						if( senkou_span_a > 16792.8 )
							if( basis_max <= 190.761 )
								if( chinkou_span <= 16794.7 )
									ret := 0.750000 // buy
								if( chinkou_span > 16794.7 )
									ret := 1.000000 // buy
							if( basis_max > 190.761 )
								ret := 0.750000 // buy
				if( senkou_span_b > 17817.2 )
					if( kinjun_sen <= 28206.1 )
						if( tenkan_sen <= 22139.5 )
							if( chinkou_span <= 17965.1 )
								if( senkou_span_b_displaced <= 19025 )
									ret := -0.931034 // sell
								if( senkou_span_b_displaced > 19025 )
									ret := -0.562500
							if( chinkou_span > 17965.1 )
								if( basis_minus <= -1260.46 )
									ret := 0.909091 // buy
								if( basis_minus > -1260.46 )
									ret := 0.033613
						if( tenkan_sen > 22139.5 )
							if( tenkan_sen <= 23476.9 )
								if( senkou_span_a <= 22358.2 )
									ret := -0.750000 // sell
								if( senkou_span_a > 22358.2 )
									ret := -1.000000 // sell
							if( tenkan_sen > 23476.9 )
								if( senkou_span_a_displaced <= 26834.5 )
									ret := 0.444444
								if( senkou_span_a_displaced > 26834.5 )
									ret := -0.935484 // sell
					if( kinjun_sen > 28206.1 )
						if( tenkan_sen <= 30874.3 )
							if( basis_minus <= -689.542 )
								if( basis_max <= -261.963 )
									ret := 0.000000
								if( basis_max > -261.963 )
									ret := 0.825175 // buy
							if( basis_minus > -689.542 )
								if( basis_max <= 202.961 )
									ret := 1.000000 // buy
								if( basis_max > 202.961 )
									ret := -0.900000 // sell
						if( tenkan_sen > 30874.3 )
							if( senkou_span_b_displaced <= 36151.2 )
								if( senkou_span_a <= 33132.7 )
									ret := -0.009404
								if( senkou_span_a > 33132.7 )
									ret := 0.475177
							if( senkou_span_b_displaced > 36151.2 )
								if( chinkou_span <= 34522.4 )
									ret := 0.325000
								if( chinkou_span > 34522.4 )
									ret := -0.462963
			if( chinkou_span > 35268 )
				if( tenkan_sen <= 35846.1 )
					if( kinjun_sen <= 35407.6 )
						if( tenkan_sen <= 32145 )
							if( tenkan_sen <= 32072.5 )
								ret := 1.000000 // buy
							if( tenkan_sen > 32072.5 )
								ret := -0.750000 // sell
						if( tenkan_sen > 32145 )
							if( chinkou_span <= 36125.3 )
								if( senkou_span_b <= 36237.6 )
									ret := 0.950000 // buy
								if( senkou_span_b > 36237.6 )
									ret := 0.750000 // buy
							if( chinkou_span > 36125.3 )
								if( senkou_span_b <= 35026 )
									ret := 0.969697 // buy
								if( senkou_span_b > 35026 )
									ret := 0.388889
					if( kinjun_sen > 35407.6 )
						if( senkou_span_a <= 35680.7 )
							if( tenkan_sen <= 35267.5 )
								if( kinjun_sen <= 35553.6 )
									ret := 0.200000
								if( kinjun_sen > 35553.6 )
									ret := -0.666667
							if( tenkan_sen > 35267.5 )
								if( tenkan_sen <= 35505.2 )
									ret := 0.882353 // buy
								if( tenkan_sen > 35505.2 )
									ret := 0.352941
						if( senkou_span_a > 35680.7 )
							if( senkou_span_b_displaced <= 38467.8 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 38467.8 )
								if( senkou_span_b_displaced <= 38691.4 )
									ret := -0.200000
								if( senkou_span_b_displaced > 38691.4 )
									ret := 1.000000 // buy
				if( tenkan_sen > 35846.1 )
					if( senkou_span_a <= 36580.4 )
						if( kinjun_sen <= 35831.3 )
							if( basis_max <= -405.441 )
								ret := -0.250000
							if( basis_max > -405.441 )
								if( basis_max <= -333.897 )
									ret := 0.750000 // buy
								if( basis_max > -333.897 )
									ret := 1.000000 // buy
						if( kinjun_sen > 35831.3 )
							if( senkou_span_a_displaced <= 38562.2 )
								if( senkou_span_a_displaced <= 37132.8 )
									ret := -0.769231 // sell
								if( senkou_span_a_displaced > 37132.8 )
									ret := -0.121212
							if( senkou_span_a_displaced > 38562.2 )
								if( tenkan_sen <= 36079.5 )
									ret := -0.750000 // sell
								if( tenkan_sen > 36079.5 )
									ret := -1.000000 // sell
					if( senkou_span_a > 36580.4 )
						if( kinjun_sen <= 37921 )
							if( kinjun_sen <= 37615.8 )
								if( tenkan_sen <= 37603.8 )
									ret := 0.528926
								if( tenkan_sen > 37603.8 )
									ret := -1.000000 // sell
							if( kinjun_sen > 37615.8 )
								if( senkou_span_b <= 38420.9 )
									ret := -1.000000 // sell
								if( senkou_span_b > 38420.9 )
									ret := -0.750000 // sell
						if( kinjun_sen > 37921 )
							if( senkou_span_a <= 38364.6 )
								if( senkou_span_b_displaced <= 36881.8 )
									ret := 0.875000 // buy
								if( senkou_span_b_displaced > 36881.8 )
									ret := 0.987952 // buy
							if( senkou_span_a > 38364.6 )
								if( basis_minus <= -736.376 )
									ret := 0.857143 // buy
								if( basis_minus > -736.376 )
									ret := 0.222222
		if( senkou_span_a_displaced > 39601.1 )
			if( chinkou_span <= 46101.3 )
				if( senkou_span_a <= 43481.8 )
					if( basis_minus <= -1963.71 )
						if( tenkan_sen <= 38216.8 )
							ret := -0.750000 // sell
						if( tenkan_sen > 38216.8 )
							ret := -1.000000 // sell
					if( basis_minus > -1963.71 )
						if( chinkou_span <= 37320.2 )
							if( kinjun_sen <= 39661.2 )
								if( chinkou_span <= 35401.2 )
									ret := -0.888889 // sell
								if( chinkou_span > 35401.2 )
									ret := 0.566667
							if( kinjun_sen > 39661.2 )
								if( basis_max <= 759.977 )
									ret := -1.000000 // sell
								if( basis_max > 759.977 )
									ret := -0.500000
						if( chinkou_span > 37320.2 )
							if( senkou_span_a_displaced <= 40144.8 )
								if( senkou_span_b_displaced <= 40588.1 )
									ret := 0.384615
								if( senkou_span_b_displaced > 40588.1 )
									ret := -0.805556 // sell
							if( senkou_span_a_displaced > 40144.8 )
								if( tenkan_sen <= 39691.1 )
									ret := 0.477124
								if( tenkan_sen > 39691.1 )
									ret := 0.033981
				if( senkou_span_a > 43481.8 )
					if( chinkou_span <= 43519.2 )
						if( senkou_span_b_displaced <= 47900.4 )
							if( tenkan_sen <= 45941.2 )
								if( basis_max <= 458.235 )
									ret := -0.871795 // sell
								if( basis_max > 458.235 )
									ret := -0.530612
							if( tenkan_sen > 45941.2 )
								if( senkou_span_b <= 47262.8 )
									ret := 0.666667
								if( senkou_span_b > 47262.8 )
									ret := -0.333333
						if( senkou_span_b_displaced > 47900.4 )
							ret := 1.000000 // buy
					if( chinkou_span > 43519.2 )
						if( basis_minus <= -1258.87 )
							if( senkou_span_a_displaced <= 47822.2 )
								if( chinkou_span <= 45149.5 )
									ret := 0.000000
								if( chinkou_span > 45149.5 )
									ret := 0.875000 // buy
							if( senkou_span_a_displaced > 47822.2 )
								ret := 1.000000 // buy
						if( basis_minus > -1258.87 )
							if( kinjun_sen <= 45897.1 )
								if( senkou_span_a <= 44889.9 )
									ret := -0.545455
								if( senkou_span_a > 44889.9 )
									ret := 0.400000
							if( kinjun_sen > 45897.1 )
								if( senkou_span_a_displaced <= 51492.3 )
									ret := -0.787234 // sell
								if( senkou_span_a_displaced > 51492.3 )
									ret := 0.000000
			if( chinkou_span > 46101.3 )
				if( senkou_span_a_displaced <= 49061 )
					if( senkou_span_b_displaced <= 49482.4 )
						if( senkou_span_b_displaced <= 46547.8 )
							if( senkou_span_a <= 45130.4 )
								if( basis_max <= 251.871 )
									ret := 0.909091 // buy
								if( basis_max > 251.871 )
									ret := -0.333333
							if( senkou_span_a > 45130.4 )
								ret := 0.000000
						if( senkou_span_b_displaced > 46547.8 )
							if( senkou_span_b <= 45834.7 )
								if( tenkan_sen <= 44770.1 )
									ret := -0.166667
								if( tenkan_sen > 44770.1 )
									ret := -1.000000 // sell
							if( senkou_span_b > 45834.7 )
								if( tenkan_sen <= 46591.2 )
									ret := 0.631579
								if( tenkan_sen > 46591.2 )
									ret := 0.019417
					if( senkou_span_b_displaced > 49482.4 )
						if( chinkou_span <= 48433.3 )
							ret := 0.400000
						if( chinkou_span > 48433.3 )
							if( senkou_span_b <= 49715 )
								if( senkou_span_a <= 48161.7 )
									ret := 1.000000 // buy
								if( senkou_span_a > 48161.7 )
									ret := 0.833333 // buy
							if( senkou_span_b > 49715 )
								ret := 0.750000 // buy
				if( senkou_span_a_displaced > 49061 )
					if( chinkou_span <= 49340.6 )
						if( tenkan_sen <= 50425.6 )
							if( senkou_span_a_displaced <= 51016.5 )
								if( basis_max <= 270.724 )
									ret := -0.629213
								if( basis_max > 270.724 )
									ret := 0.009346
							if( senkou_span_a_displaced > 51016.5 )
								if( kinjun_sen <= 50001.7 )
									ret := 0.137255
								if( kinjun_sen > 50001.7 )
									ret := 0.750000 // buy
						if( tenkan_sen > 50425.6 )
							if( basis_max <= 244.588 )
								ret := -0.714286 // sell
							if( basis_max > 244.588 )
								ret := -1.000000 // sell
					if( chinkou_span > 49340.6 )
						if( senkou_span_a <= 58962.7 )
							if( basis_max <= 322.227 )
								if( senkou_span_b_displaced <= 55104.5 )
									ret := 0.680851
								if( senkou_span_b_displaced > 55104.5 )
									ret := 0.324363
							if( basis_max > 322.227 )
								if( senkou_span_a_displaced <= 55647.3 )
									ret := -0.483516
								if( senkou_span_a_displaced > 55647.3 )
									ret := 0.159204
						if( senkou_span_a > 58962.7 )
							if( senkou_span_a_displaced <= 63822.4 )
								if( senkou_span_b <= 62199.6 )
									ret := -0.018229
								if( senkou_span_b > 62199.6 )
									ret := -0.594828
							if( senkou_span_a_displaced > 63822.4 )
								if( kinjun_sen <= 63795.7 )
									ret := 0.441176
								if( kinjun_sen > 63795.7 )
									ret := 0.043537
	if( basis_minus > -674.953 )
		if( kinjun_sen <= 68830.4 )
			if( senkou_span_a_displaced <= 20469.8 )
				if( kinjun_sen <= 20433.3 )
					if( basis_max <= 44.4363 )
						if( basis_max <= -265.341 )
							if( senkou_span_b_displaced <= 18863.6 )
								if( senkou_span_b_displaced <= 18736.5 )
									ret := 0.000000
								if( senkou_span_b_displaced > 18736.5 )
									ret := -1.000000 // sell
							if( senkou_span_b_displaced > 18863.6 )
								if( basis_max <= -331.642 )
									ret := 0.500000
								if( basis_max > -331.642 )
									ret := 0.979592 // buy
						if( basis_max > -265.341 )
							if( basis_minus <= 291.359 )
								if( senkou_span_b_displaced <= 10119.7 )
									ret := -0.347826
								if( senkou_span_b_displaced > 10119.7 )
									ret := 0.069594
							if( basis_minus > 291.359 )
								if( chinkou_span <= 20696.3 )
									ret := -0.262480
								if( chinkou_span > 20696.3 )
									ret := 0.600000
					if( basis_max > 44.4363 )
						if( chinkou_span <= 19456.5 )
							if( senkou_span_b <= 18307.6 )
								if( senkou_span_b_displaced <= 16854.6 )
									ret := 0.527473
								if( senkou_span_b_displaced > 16854.6 )
									ret := 0.226148
							if( senkou_span_b > 18307.6 )
								if( senkou_span_a_displaced <= 19854.1 )
									ret := 0.031250
								if( senkou_span_a_displaced > 19854.1 )
									ret := -0.533898
						if( chinkou_span > 19456.5 )
							if( senkou_span_b_displaced <= 19863.3 )
								if( basis_minus <= -44.0388 )
									ret := 0.894231 // buy
								if( basis_minus > -44.0388 )
									ret := 0.690476
							if( senkou_span_b_displaced > 19863.3 )
								if( tenkan_sen <= 19160.9 )
									ret := -0.473684
								if( tenkan_sen > 19160.9 )
									ret := 0.436364
				if( kinjun_sen > 20433.3 )
					if( chinkou_span <= 21770.1 )
						if( basis_minus <= 471.764 )
							if( basis_minus <= 126.842 )
								if( chinkou_span <= 21415 )
									ret := 0.192308
								if( chinkou_span > 21415 )
									ret := -0.800000 // sell
							if( basis_minus > 126.842 )
								if( basis_max <= -22.5634 )
									ret := 0.407895
								if( basis_max > -22.5634 )
									ret := 0.913793 // buy
						if( basis_minus > 471.764 )
							if( senkou_span_a <= 20588.9 )
								ret := 1.000000 // buy
							if( senkou_span_a > 20588.9 )
								if( senkou_span_b_displaced <= 20009.7 )
									ret := 0.000000
								if( senkou_span_b_displaced > 20009.7 )
									ret := -0.928571 // sell
					if( chinkou_span > 21770.1 )
						if( tenkan_sen <= 22202.1 )
							if( senkou_span_b <= 21319.6 )
								if( senkou_span_b <= 20650.3 )
									ret := 0.894737 // buy
								if( senkou_span_b > 20650.3 )
									ret := 1.000000 // buy
							if( senkou_span_b > 21319.6 )
								if( tenkan_sen <= 22074.2 )
									ret := -0.250000
								if( tenkan_sen > 22074.2 )
									ret := 1.000000 // buy
						if( tenkan_sen > 22202.1 )
							if( tenkan_sen <= 22586.5 )
								if( basis_minus <= 633.921 )
									ret := 0.000000
								if( basis_minus > 633.921 )
									ret := -0.800000 // sell
							if( tenkan_sen > 22586.5 )
								ret := 0.250000
			if( senkou_span_a_displaced > 20469.8 )
				if( senkou_span_a_displaced <= 20861.8 )
					if( senkou_span_b_displaced <= 20289.4 )
						if( kinjun_sen <= 20459.2 )
							ret := 1.000000 // buy
						if( kinjun_sen > 20459.2 )
							if( senkou_span_b_displaced <= 20122.3 )
								if( tenkan_sen <= 20885.3 )
									ret := 0.137931
								if( tenkan_sen > 20885.3 )
									ret := -0.700000 // sell
							if( senkou_span_b_displaced > 20122.3 )
								if( basis_minus <= 189.262 )
									ret := -0.153846
								if( basis_minus > 189.262 )
									ret := 0.705882 // buy
					if( senkou_span_b_displaced > 20289.4 )
						if( basis_max <= -178.712 )
							if( chinkou_span <= 24131.5 )
								if( chinkou_span <= 21751.9 )
									ret := -0.764706 // sell
								if( chinkou_span > 21751.9 )
									ret := -0.933333 // sell
							if( chinkou_span > 24131.5 )
								ret := -0.500000
						if( basis_max > -178.712 )
							if( senkou_span_a <= 21994.3 )
								if( chinkou_span <= 19780.4 )
									ret := -0.514706
								if( chinkou_span > 19780.4 )
									ret := -0.214920
							if( senkou_span_a > 21994.3 )
								ret := 1.000000 // buy
				if( senkou_span_a_displaced > 20861.8 )
					if( chinkou_span <= 66501 )
						if( chinkou_span <= 21096.1 )
							if( basis_minus <= -378.42 )
								if( senkou_span_a <= 20773.3 )
									ret := 0.630137
								if( senkou_span_a > 20773.3 )
									ret := 0.020833
							if( basis_minus > -378.42 )
								if( senkou_span_a <= 21266 )
									ret := -0.209567
								if( senkou_span_a > 21266 )
									ret := -0.606469
						if( chinkou_span > 21096.1 )
							if( tenkan_sen <= 21215.9 )
								if( kinjun_sen <= 21266.2 )
									ret := 0.613497
								if( kinjun_sen > 21266.2 )
									ret := -0.347826
							if( tenkan_sen > 21215.9 )
								if( tenkan_sen <= 66156.4 )
									ret := 0.035067
								if( tenkan_sen > 66156.4 )
									ret := -0.333856
					if( chinkou_span > 66501 )
						if( senkou_span_a <= 65960.5 )
							if( basis_max <= -433.192 )
								if( tenkan_sen <= 63707.4 )
									ret := -0.875000 // sell
								if( tenkan_sen > 63707.4 )
									ret := 0.173913
							if( basis_max > -433.192 )
								if( kinjun_sen <= 65943 )
									ret := 0.717687 // buy
								if( kinjun_sen > 65943 )
									ret := -0.750000 // sell
						if( senkou_span_a > 65960.5 )
							if( chinkou_span <= 68421.2 )
								if( senkou_span_a <= 68404.7 )
									ret := 0.157116
								if( senkou_span_a > 68404.7 )
									ret := -0.433333
							if( chinkou_span > 68421.2 )
								if( basis_max <= -477.991 )
									ret := -0.545455
								if( basis_max > -477.991 )
									ret := 0.525794
		if( kinjun_sen > 68830.4 )
			if( chinkou_span <= 69071.6 )
				if( basis_minus <= -454.011 )
					if( chinkou_span <= 68030.5 )
						if( chinkou_span <= 66515.6 )
							ret := -0.285714
						if( chinkou_span > 66515.6 )
							if( senkou_span_a_displaced <= 73172.2 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 73172.2 )
								ret := 0.250000
					if( chinkou_span > 68030.5 )
						if( basis_max <= 191.421 )
							if( chinkou_span <= 68706.2 )
								ret := -1.000000 // sell
							if( chinkou_span > 68706.2 )
								ret := -0.750000 // sell
						if( basis_max > 191.421 )
							ret := 0.750000 // buy
				if( basis_minus > -454.011 )
					if( kinjun_sen <= 69520.9 )
						if( senkou_span_b_displaced <= 69504.2 )
							if( senkou_span_a_displaced <= 68771.8 )
								if( chinkou_span <= 66919.3 )
									ret := -0.911765 // sell
								if( chinkou_span > 66919.3 )
									ret := -0.333333
							if( senkou_span_a_displaced > 68771.8 )
								if( senkou_span_b_displaced <= 69225 )
									ret := 0.000000
								if( senkou_span_b_displaced > 69225 )
									ret := 0.833333 // buy
						if( senkou_span_b_displaced > 69504.2 )
							if( kinjun_sen <= 69496.4 )
								if( senkou_span_b <= 68977.2 )
									ret := 0.000000
								if( senkou_span_b > 68977.2 )
									ret := -0.827586 // sell
							if( kinjun_sen > 69496.4 )
								ret := 0.600000
					if( kinjun_sen > 69520.9 )
						if( senkou_span_b_displaced <= 70367.2 )
							if( senkou_span_a_displaced <= 69584.4 )
								if( kinjun_sen <= 69596.7 )
									ret := -1.000000 // sell
								if( kinjun_sen > 69596.7 )
									ret := -0.666667
							if( senkou_span_a_displaced > 69584.4 )
								if( chinkou_span <= 68224.7 )
									ret := -0.035714
								if( chinkou_span > 68224.7 )
									ret := -0.687500
						if( senkou_span_b_displaced > 70367.2 )
							if( kinjun_sen <= 71459.7 )
								if( basis_minus <= -310.102 )
									ret := -0.750000 // sell
								if( basis_minus > -310.102 )
									ret := -0.980769 // sell
							if( kinjun_sen > 71459.7 )
								if( senkou_span_b <= 71624.6 )
									ret := -0.142857
								if( senkou_span_b > 71624.6 )
									ret := -0.846154 // sell
			if( chinkou_span > 69071.6 )
				if( kinjun_sen <= 71129 )
					if( senkou_span_b_displaced <= 71246.1 )
						if( basis_max <= 131.497 )
							if( chinkou_span <= 70773.8 )
								if( senkou_span_b_displaced <= 70223.7 )
									ret := -0.064607
								if( senkou_span_b_displaced > 70223.7 )
									ret := -0.293478
							if( chinkou_span > 70773.8 )
								if( senkou_span_b_displaced <= 68928.2 )
									ret := -0.400000
								if( senkou_span_b_displaced > 68928.2 )
									ret := 0.350282
						if( basis_max > 131.497 )
							if( chinkou_span <= 73344.8 )
								if( senkou_span_b_displaced <= 69280.2 )
									ret := 0.595745
								if( senkou_span_b_displaced > 69280.2 )
									ret := 0.154762
							if( chinkou_span > 73344.8 )
								ret := -0.750000 // sell
					if( senkou_span_b_displaced > 71246.1 )
						if( chinkou_span <= 72758 )
							ret := 0.500000
						if( chinkou_span > 72758 )
							if( senkou_span_a_displaced <= 71948.5 )
								ret := 1.000000 // buy
							if( senkou_span_a_displaced > 71948.5 )
								ret := 0.800000 // buy
				if( kinjun_sen > 71129 )
					if( senkou_span_a <= 71404 )
						if( senkou_span_b <= 71069.7 )
							if( senkou_span_a_displaced <= 70860.9 )
								if( basis_max <= 5.73397 )
									ret := -0.727273 // sell
								if( basis_max > 5.73397 )
									ret := -1.000000 // sell
							if( senkou_span_a_displaced > 70860.9 )
								ret := -1.000000 // sell
						if( senkou_span_b > 71069.7 )
							if( senkou_span_b <= 71074.4 )
								if( senkou_span_a <= 71169.9 )
									ret := 0.000000
								if( senkou_span_a > 71169.9 )
									ret := -0.250000
							if( senkou_span_b > 71074.4 )
								if( chinkou_span <= 71322.7 )
									ret := -0.500000
								if( chinkou_span > 71322.7 )
									ret := -1.000000 // sell
					if( senkou_span_a > 71404 )
						if( basis_minus <= 1501.74 )
							if( senkou_span_a_displaced <= 72160.8 )
								if( basis_max <= 74.1979 )
									ret := 0.555556
								if( basis_max > 74.1979 )
									ret := -0.323529
							if( senkou_span_a_displaced > 72160.8 )
								if( basis_minus <= 139.592 )
									ret := -0.888889 // sell
								if( basis_minus > 139.592 )
									ret := -0.181818
						if( basis_minus > 1501.74 )
							if( kinjun_sen <= 72053.1 )
								if( basis_max <= -127.326 )
									ret := 0.000000
								if( basis_max > -127.326 )
									ret := -0.500000
							if( kinjun_sen > 72053.1 )
								if( kinjun_sen <= 72489.1 )
									ret := -1.000000 // sell
								if( kinjun_sen > 72489.1 )
									ret := -0.250000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_BTCUSDT_30Min_2baf712e(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


