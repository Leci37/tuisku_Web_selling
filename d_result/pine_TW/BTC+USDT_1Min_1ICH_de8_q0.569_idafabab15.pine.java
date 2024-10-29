//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ichimoku_Cloud
// ID_model: BTCUSDT_1Min_1ICH_afabab15 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_1Min_1ICH_afabab15", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_1Min_afabab15(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( basis_max <= 3.88261 )
		if( chinkou_span <= 56720.7 )
			if( kinjun_sen <= 56582.5 )
				if( chinkou_span <= 51536 )
					if( kinjun_sen <= 51225.5 )
						if( senkou_span_b_displaced <= 51303.3 )
							if( senkou_span_a_displaced <= 51280 )
								if( senkou_span_a <= 50240.2 )
									ret := -0.250000
								if( senkou_span_a > 50240.2 )
									ret := -0.943396 // sell
							if( senkou_span_a_displaced > 51280 )
								ret := 1.000000 // buy
						if( senkou_span_b_displaced > 51303.3 )
							if( chinkou_span <= 50234.2 )
								ret := 1.000000 // buy
							if( chinkou_span > 50234.2 )
								if( senkou_span_b_displaced <= 51894.4 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 51894.4 )
									ret := 0.333333
					if( kinjun_sen > 51225.5 )
						if( chinkou_span <= 51293.1 )
							if( chinkou_span <= 51273.2 )
								if( senkou_span_b_displaced <= 52670.9 )
									ret := -1.000000 // sell
								if( senkou_span_b_displaced > 52670.9 )
									ret := -0.750000 // sell
							if( chinkou_span > 51273.2 )
								ret := -0.500000
						if( chinkou_span > 51293.1 )
							ret := -1.000000 // sell
				if( chinkou_span > 51536 )
					if( senkou_span_b <= 51361.1 )
						if( senkou_span_a <= 51496 )
							if( kinjun_sen <= 51082.3 )
								if( chinkou_span <= 52984 )
									ret := 0.546392
								if( chinkou_span > 52984 )
									ret := -0.142857
							if( kinjun_sen > 51082.3 )
								ret := -1.000000 // sell
						if( senkou_span_a > 51496 )
							if( senkou_span_a <= 51889.4 )
								ret := 1.000000 // buy
							if( senkou_span_a > 51889.4 )
								if( basis_max <= -137.812 )
									ret := -0.333333
								if( basis_max > -137.812 )
									ret := 1.000000 // buy
					if( senkou_span_b > 51361.1 )
						if( chinkou_span <= 54214 )
							if( senkou_span_a <= 54237.4 )
								if( chinkou_span <= 54109 )
									ret := -0.138790
								if( chinkou_span > 54109 )
									ret := 0.333333
							if( senkou_span_a > 54237.4 )
								if( senkou_span_a_displaced <= 54635.6 )
									ret := -0.607143
								if( senkou_span_a_displaced > 54635.6 )
									ret := 0.909091 // buy
						if( chinkou_span > 54214 )
							if( tenkan_sen <= 54275.2 )
								if( senkou_span_b_displaced <= 52333 )
									ret := -0.410256
								if( senkou_span_b_displaced > 52333 )
									ret := 0.486874
							if( tenkan_sen > 54275.2 )
								if( senkou_span_a_displaced <= 56669 )
									ret := 0.006223
								if( senkou_span_a_displaced > 56669 )
									ret := -0.578947
			if( kinjun_sen > 56582.5 )
				if( basis_minus <= 419.377 )
					if( basis_minus <= -30.0983 )
						if( senkou_span_b <= 56697.2 )
							if( senkou_span_b_displaced <= 56751.6 )
								ret := 0.250000
							if( senkou_span_b_displaced > 56751.6 )
								if( tenkan_sen <= 56648 )
									ret := 0.750000 // buy
								if( tenkan_sen > 56648 )
									ret := 1.000000 // buy
						if( senkou_span_b > 56697.2 )
							if( senkou_span_b_displaced <= 57148.3 )
								if( senkou_span_b <= 56744.8 )
									ret := 0.130435
								if( senkou_span_b > 56744.8 )
									ret := -0.431034
							if( senkou_span_b_displaced > 57148.3 )
								if( kinjun_sen <= 56838.1 )
									ret := 1.000000 // buy
								if( kinjun_sen > 56838.1 )
									ret := 0.000000
					if( basis_minus > -30.0983 )
						if( tenkan_sen <= 56798.6 )
							if( chinkou_span <= 56191.1 )
								if( tenkan_sen <= 56703.7 )
									ret := -0.500000
								if( tenkan_sen > 56703.7 )
									ret := 0.857143 // buy
							if( chinkou_span > 56191.1 )
								if( chinkou_span <= 56553.2 )
									ret := -0.610442
								if( chinkou_span > 56553.2 )
									ret := -0.306905
						if( tenkan_sen > 56798.6 )
							if( kinjun_sen <= 57034.4 )
								if( senkou_span_b <= 56788.2 )
									ret := -0.683673
								if( senkou_span_b > 56788.2 )
									ret := -0.321839
							if( kinjun_sen > 57034.4 )
								if( chinkou_span <= 56690 )
									ret := -0.949367 // sell
								if( chinkou_span > 56690 )
									ret := -0.250000
				if( basis_minus > 419.377 )
					if( basis_minus <= 464.637 )
						if( basis_max <= -40.921 )
							ret := 0.750000 // buy
						if( basis_max > -40.921 )
							ret := 1.000000 // buy
					if( basis_minus > 464.637 )
						ret := 0.250000
		if( chinkou_span > 56720.7 )
			if( senkou_span_b <= 56648.4 )
				if( chinkou_span <= 57136.9 )
					if( basis_minus <= 243.898 )
						if( senkou_span_b_displaced <= 56442.3 )
							if( tenkan_sen <= 56801.9 )
								if( basis_max <= -65.7126 )
									ret := 0.888889 // buy
								if( basis_max > -65.7126 )
									ret := 0.644737
							if( tenkan_sen > 56801.9 )
								if( senkou_span_b_displaced <= 56293.1 )
									ret := -0.750000 // sell
								if( senkou_span_b_displaced > 56293.1 )
									ret := -0.200000
						if( senkou_span_b_displaced > 56442.3 )
							if( senkou_span_b <= 56483.4 )
								if( senkou_span_b <= 56453.5 )
									ret := 0.000000
								if( senkou_span_b > 56453.5 )
									ret := -0.962963 // sell
							if( senkou_span_b > 56483.4 )
								if( senkou_span_b_displaced <= 56531.8 )
									ret := 0.102564
								if( senkou_span_b_displaced > 56531.8 )
									ret := 0.513208
					if( basis_minus > 243.898 )
						if( kinjun_sen <= 56483.2 )
							if( basis_max <= -99.1827 )
								ret := -0.400000
							if( basis_max > -99.1827 )
								if( senkou_span_a <= 55706.3 )
									ret := 0.600000
								if( senkou_span_a > 55706.3 )
									ret := 1.000000 // buy
						if( kinjun_sen > 56483.2 )
							if( basis_minus <= 272.64 )
								if( senkou_span_a_displaced <= 55931.1 )
									ret := -1.000000 // sell
								if( senkou_span_a_displaced > 55931.1 )
									ret := 0.000000
							if( basis_minus > 272.64 )
								if( kinjun_sen <= 56580.1 )
									ret := -0.545455
								if( kinjun_sen > 56580.1 )
									ret := -0.897959 // sell
				if( chinkou_span > 57136.9 )
					if( senkou_span_b_displaced <= 56833.2 )
						if( basis_minus <= 14.9157 )
							if( senkou_span_a_displaced <= 56477.6 )
								ret := 0.200000
							if( senkou_span_a_displaced > 56477.6 )
								ret := -0.600000
						if( basis_minus > 14.9157 )
							if( basis_max <= -159.911 )
								ret := -0.142857
							if( basis_max > -159.911 )
								if( senkou_span_a <= 57254.6 )
									ret := 0.896552 // buy
								if( senkou_span_a > 57254.6 )
									ret := 0.250000
					if( senkou_span_b_displaced > 56833.2 )
						if( tenkan_sen <= 56893.4 )
							ret := -1.000000 // sell
						if( tenkan_sen > 56893.4 )
							ret := -0.250000
			if( senkou_span_b > 56648.4 )
				if( basis_max <= -68.9617 )
					if( chinkou_span <= 57420.9 )
						if( kinjun_sen <= 56931.8 )
							if( senkou_span_b <= 56726.3 )
								if( senkou_span_a_displaced <= 56639.7 )
									ret := 0.500000
								if( senkou_span_a_displaced > 56639.7 )
									ret := -0.222222
							if( senkou_span_b > 56726.3 )
								if( senkou_span_a_displaced <= 56816.3 )
									ret := 0.944444 // buy
								if( senkou_span_a_displaced > 56816.3 )
									ret := 0.571429
						if( kinjun_sen > 56931.8 )
							if( chinkou_span <= 57033.6 )
								if( basis_minus <= 167.87 )
									ret := -0.897959 // sell
								if( basis_minus > 167.87 )
									ret := -0.250000
							if( chinkou_span > 57033.6 )
								if( senkou_span_b_displaced <= 56938.2 )
									ret := -0.718750 // sell
								if( senkou_span_b_displaced > 56938.2 )
									ret := -0.055556
					if( chinkou_span > 57420.9 )
						if( tenkan_sen <= 57773.8 )
							if( basis_minus <= 368.922 )
								if( kinjun_sen <= 57293.3 )
									ret := 0.852632 // buy
								if( kinjun_sen > 57293.3 )
									ret := 0.569832
							if( basis_minus > 368.922 )
								if( senkou_span_b_displaced <= 56288.6 )
									ret := 0.720000 // buy
								if( senkou_span_b_displaced > 56288.6 )
									ret := -0.750000 // sell
						if( tenkan_sen > 57773.8 )
							if( chinkou_span <= 58249.8 )
								if( tenkan_sen <= 58241.6 )
									ret := -0.123779
								if( tenkan_sen > 58241.6 )
									ret := -0.924731 // sell
							if( chinkou_span > 58249.8 )
								if( basis_minus <= 64.0325 )
									ret := 0.286142
								if( basis_minus > 64.0325 )
									ret := 0.062087
				if( basis_max > -68.9617 )
					if( chinkou_span <= 57032 )
						if( tenkan_sen <= 56799.4 )
							if( kinjun_sen <= 56772.6 )
								if( senkou_span_a <= 56685.3 )
									ret := -0.185185
								if( senkou_span_a > 56685.3 )
									ret := 0.409420
							if( kinjun_sen > 56772.6 )
								if( chinkou_span <= 56794 )
									ret := -0.823529 // sell
								if( chinkou_span > 56794 )
									ret := 0.200000
						if( tenkan_sen > 56799.4 )
							if( senkou_span_a_displaced <= 56723.5 )
								if( senkou_span_b <= 56808.9 )
									ret := 0.333333
								if( senkou_span_b > 56808.9 )
									ret := -0.821429 // sell
							if( senkou_span_a_displaced > 56723.5 )
								if( senkou_span_a <= 56938.6 )
									ret := -0.258696
								if( senkou_span_a > 56938.6 )
									ret := -0.467128
					if( chinkou_span > 57032 )
						if( senkou_span_a <= 57142.8 )
							if( tenkan_sen <= 57046.1 )
								if( senkou_span_a_displaced <= 56750 )
									ret := -0.037037
								if( senkou_span_a_displaced > 56750 )
									ret := 0.558719
							if( tenkan_sen > 57046.1 )
								if( senkou_span_b <= 56995.2 )
									ret := -0.086207
								if( senkou_span_b > 56995.2 )
									ret := 0.350282
						if( senkou_span_a > 57142.8 )
							if( basis_max <= -27.9331 )
								if( tenkan_sen <= 57604.2 )
									ret := 0.164410
								if( tenkan_sen > 57604.2 )
									ret := -0.011422
							if( basis_max > -27.9331 )
								if( chinkou_span <= 57708.8 )
									ret := -0.133488
								if( chinkou_span > 57708.8 )
									ret := 0.035830
	if( basis_max > 3.88261 )
		if( senkou_span_b_displaced <= 59212.4 )
			if( chinkou_span <= 58987.7 )
				if( chinkou_span <= 53355.9 )
					if( senkou_span_a <= 51234.9 )
						if( basis_max <= 173.191 )
							if( kinjun_sen <= 51172.8 )
								if( senkou_span_b_displaced <= 50470.7 )
									ret := 1.000000 // buy
								if( senkou_span_b_displaced > 50470.7 )
									ret := -0.571429
							if( kinjun_sen > 51172.8 )
								if( kinjun_sen <= 51307.1 )
									ret := 0.884058 // buy
								if( kinjun_sen > 51307.1 )
									ret := 0.222222
						if( basis_max > 173.191 )
							if( senkou_span_b_displaced <= 51263.5 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 51263.5 )
								if( senkou_span_a_displaced <= 51341.7 )
									ret := -0.500000
								if( senkou_span_a_displaced > 51341.7 )
									ret := 0.888889 // buy
					if( senkou_span_a > 51234.9 )
						if( chinkou_span <= 51319.9 )
							if( senkou_span_b_displaced <= 53194.9 )
								if( tenkan_sen <= 51211.3 )
									ret := 0.000000
								if( tenkan_sen > 51211.3 )
									ret := -0.962264 // sell
							if( senkou_span_b_displaced > 53194.9 )
								ret := 0.500000
						if( chinkou_span > 51319.9 )
							if( kinjun_sen <= 53033.2 )
								if( senkou_span_a_displaced <= 52720.6 )
									ret := -0.644860
								if( senkou_span_a_displaced > 52720.6 )
									ret := 0.829060 // buy
							if( kinjun_sen > 53033.2 )
								if( senkou_span_a_displaced <= 54241.6 )
									ret := -0.455056
								if( senkou_span_a_displaced > 54241.6 )
									ret := -0.897436 // sell
				if( chinkou_span > 53355.9 )
					if( tenkan_sen <= 54137.5 )
						if( senkou_span_b <= 54132.2 )
							if( kinjun_sen <= 53641.6 )
								if( senkou_span_b_displaced <= 54183.5 )
									ret := 0.836735 // buy
								if( senkou_span_b_displaced > 54183.5 )
									ret := -1.000000 // sell
							if( kinjun_sen > 53641.6 )
								if( senkou_span_a <= 53685.6 )
									ret := -0.538462
								if( senkou_span_a > 53685.6 )
									ret := 0.206166
						if( senkou_span_b > 54132.2 )
							if( basis_minus <= -91.5576 )
								if( senkou_span_b <= 54725.3 )
									ret := 0.866667 // buy
								if( senkou_span_b > 54725.3 )
									ret := 0.452381
							if( basis_minus > -91.5576 )
								if( senkou_span_a_displaced <= 54291.6 )
									ret := 0.848485 // buy
								if( senkou_span_a_displaced > 54291.6 )
									ret := -0.333333
					if( tenkan_sen > 54137.5 )
						if( chinkou_span <= 54972.4 )
							if( senkou_span_a <= 54615.6 )
								if( senkou_span_b <= 54198.8 )
									ret := 0.630631
								if( senkou_span_b > 54198.8 )
									ret := 0.075304
							if( senkou_span_a > 54615.6 )
								if( tenkan_sen <= 55445.8 )
									ret := -0.316502
								if( tenkan_sen > 55445.8 )
									ret := -0.879747 // sell
						if( chinkou_span > 54972.4 )
							if( tenkan_sen <= 55096.3 )
								if( senkou_span_b <= 54982.6 )
									ret := 0.857143 // buy
								if( senkou_span_b > 54982.6 )
									ret := 0.467347
							if( tenkan_sen > 55096.3 )
								if( chinkou_span <= 55180.3 )
									ret := -0.712766 // sell
								if( chinkou_span > 55180.3 )
									ret := 0.111679
			if( chinkou_span > 58987.7 )
				if( tenkan_sen <= 59054.8 )
					if( chinkou_span <= 59066.1 )
						if( senkou_span_b_displaced <= 58480.8 )
							if( senkou_span_a <= 58994.2 )
								ret := -0.600000
							if( senkou_span_a > 58994.2 )
								if( chinkou_span <= 59051.2 )
									ret := -0.750000 // sell
								if( chinkou_span > 59051.2 )
									ret := -1.000000 // sell
						if( senkou_span_b_displaced > 58480.8 )
							if( basis_max <= 46.205 )
								if( basis_max <= 32.3862 )
									ret := 0.434944
								if( basis_max > 32.3862 )
									ret := -0.190476
							if( basis_max > 46.205 )
								if( senkou_span_a <= 59049.4 )
									ret := 0.812500 // buy
								if( senkou_span_a > 59049.4 )
									ret := 0.000000
					if( chinkou_span > 59066.1 )
						if( kinjun_sen <= 58894.9 )
							if( basis_minus <= -166.585 )
								if( basis_max <= 47.6875 )
									ret := 0.500000
								if( basis_max > 47.6875 )
									ret := -0.285714
							if( basis_minus > -166.585 )
								if( basis_minus <= -9.79524 )
									ret := 0.927835 // buy
								if( basis_minus > -9.79524 )
									ret := 0.754717 // buy
						if( kinjun_sen > 58894.9 )
							if( senkou_span_b <= 59011.8 )
								if( chinkou_span <= 59135.1 )
									ret := -0.259259
								if( chinkou_span > 59135.1 )
									ret := 0.500000
							if( senkou_span_b > 59011.8 )
								if( kinjun_sen <= 59120.6 )
									ret := 0.681672
								if( kinjun_sen > 59120.6 )
									ret := -0.333333
				if( tenkan_sen > 59054.8 )
					if( senkou_span_b <= 59363.2 )
						if( chinkou_span <= 59265.4 )
							if( senkou_span_b_displaced <= 58938 )
								if( basis_max <= 24.9578 )
									ret := -0.739130 // sell
								if( basis_max > 24.9578 )
									ret := -0.315789
							if( senkou_span_b_displaced > 58938 )
								if( senkou_span_a_displaced <= 59009.4 )
									ret := -0.812500 // sell
								if( senkou_span_a_displaced > 59009.4 )
									ret := 0.149925
						if( chinkou_span > 59265.4 )
							if( kinjun_sen <= 59459.6 )
								if( chinkou_span <= 59507.1 )
									ret := 0.495370
								if( chinkou_span > 59507.1 )
									ret := 0.900990 // buy
							if( kinjun_sen > 59459.6 )
								if( senkou_span_b <= 59306.7 )
									ret := 0.909091 // buy
								if( senkou_span_b > 59306.7 )
									ret := -0.222222
					if( senkou_span_b > 59363.2 )
						if( tenkan_sen <= 59253.5 )
							if( kinjun_sen <= 59273.8 )
								ret := 1.000000 // buy
							if( kinjun_sen > 59273.8 )
								if( senkou_span_a <= 59248.2 )
									ret := 0.500000
								if( senkou_span_a > 59248.2 )
									ret := 0.750000 // buy
						if( tenkan_sen > 59253.5 )
							if( senkou_span_b_displaced <= 58945.5 )
								ret := 1.000000 // buy
							if( senkou_span_b_displaced > 58945.5 )
								if( basis_max <= 69.185 )
									ret := -0.728571 // sell
								if( basis_max > 69.185 )
									ret := 0.333333
		if( senkou_span_b_displaced > 59212.4 )
			if( chinkou_span <= 59456.6 )
				if( tenkan_sen <= 59284.1 )
					if( chinkou_span <= 58881.1 )
						if( tenkan_sen <= 58687.9 )
							if( chinkou_span <= 57895.5 )
								if( kinjun_sen <= 58533.1 )
									ret := -0.250000
								if( kinjun_sen > 58533.1 )
									ret := -0.826087 // sell
							if( chinkou_span > 57895.5 )
								if( senkou_span_b_displaced <= 59304.2 )
									ret := -0.545455
								if( senkou_span_b_displaced > 59304.2 )
									ret := 0.658537
						if( tenkan_sen > 58687.9 )
							if( chinkou_span <= 58411 )
								if( senkou_span_b <= 58931.3 )
									ret := -0.285714
								if( senkou_span_b > 58931.3 )
									ret := -0.961538 // sell
							if( chinkou_span > 58411 )
								if( senkou_span_a_displaced <= 59179.6 )
									ret := -0.875000 // sell
								if( senkou_span_a_displaced > 59179.6 )
									ret := -0.443182
					if( chinkou_span > 58881.1 )
						if( senkou_span_a <= 59151.4 )
							if( basis_max <= 189.656 )
								if( senkou_span_b_displaced <= 59243.6 )
									ret := -0.142857
								if( senkou_span_b_displaced > 59243.6 )
									ret := 0.527005
							if( basis_max > 189.656 )
								if( tenkan_sen <= 58402.5 )
									ret := 1.000000 // buy
								if( tenkan_sen > 58402.5 )
									ret := -0.717949 // sell
						if( senkou_span_a > 59151.4 )
							if( basis_minus <= -473.741 )
								if( senkou_span_b_displaced <= 60465.2 )
									ret := 0.631579
								if( senkou_span_b_displaced > 60465.2 )
									ret := 0.967742 // buy
							if( basis_minus > -473.741 )
								if( senkou_span_b_displaced <= 60055 )
									ret := 0.047074
								if( senkou_span_b_displaced > 60055 )
									ret := -0.733333 // sell
				if( tenkan_sen > 59284.1 )
					if( chinkou_span <= 59355.6 )
						if( senkou_span_a_displaced <= 61503.2 )
							if( senkou_span_b_displaced <= 59371.2 )
								if( chinkou_span <= 58987.2 )
									ret := -0.884615 // sell
								if( chinkou_span > 58987.2 )
									ret := -0.083333
							if( senkou_span_b_displaced > 59371.2 )
								if( senkou_span_b_displaced <= 60634.5 )
									ret := -0.651460
								if( senkou_span_b_displaced > 60634.5 )
									ret := -0.971963 // sell
						if( senkou_span_a_displaced > 61503.2 )
							if( chinkou_span <= 59033.3 )
								ret := 1.000000 // buy
							if( chinkou_span > 59033.3 )
								ret := -0.400000
					if( chinkou_span > 59355.6 )
						if( senkou_span_b <= 59656.5 )
							if( basis_minus <= -157.255 )
								if( senkou_span_a_displaced <= 59583.9 )
									ret := -0.250000
								if( senkou_span_a_displaced > 59583.9 )
									ret := -1.000000 // sell
							if( basis_minus > -157.255 )
								if( senkou_span_a_displaced <= 59673.1 )
									ret := -0.007712
								if( senkou_span_a_displaced > 59673.1 )
									ret := 0.729730 // buy
						if( senkou_span_b > 59656.5 )
							if( tenkan_sen <= 59460.4 )
								if( chinkou_span <= 59420.4 )
									ret := 0.750000 // buy
								if( chinkou_span > 59420.4 )
									ret := 1.000000 // buy
							if( tenkan_sen > 59460.4 )
								if( basis_max <= 17.8466 )
									ret := -0.877193 // sell
								if( basis_max > 17.8466 )
									ret := -0.496552
			if( chinkou_span > 59456.6 )
				if( senkou_span_a <= 59578.6 )
					if( basis_max <= 10.3538 )
						if( senkou_span_b_displaced <= 59600.1 )
							if( basis_minus <= 50.8201 )
								if( senkou_span_a_displaced <= 59437.5 )
									ret := 0.653333
								if( senkou_span_a_displaced > 59437.5 )
									ret := 0.273381
							if( basis_minus > 50.8201 )
								if( senkou_span_a <= 59450.1 )
									ret := -0.600000
								if( senkou_span_a > 59450.1 )
									ret := 0.181818
						if( senkou_span_b_displaced > 59600.1 )
							if( chinkou_span <= 59648.4 )
								if( kinjun_sen <= 59533.4 )
									ret := -0.454545
								if( kinjun_sen > 59533.4 )
									ret := -1.000000 // sell
							if( chinkou_span > 59648.4 )
								ret := 0.500000
					if( basis_max > 10.3538 )
						if( chinkou_span <= 59483.8 )
							if( senkou_span_a_displaced <= 59620.2 )
								if( senkou_span_b_displaced <= 59564.8 )
									ret := 0.229508
								if( senkou_span_b_displaced > 59564.8 )
									ret := -0.514286
							if( senkou_span_a_displaced > 59620.2 )
								if( basis_max <= 29.3075 )
									ret := 0.428571
								if( basis_max > 29.3075 )
									ret := 0.878049 // buy
						if( chinkou_span > 59483.8 )
							if( senkou_span_b <= 59153.9 )
								if( senkou_span_b_displaced <= 59653.6 )
									ret := 0.905405 // buy
								if( senkou_span_b_displaced > 59653.6 )
									ret := 0.000000
							if( senkou_span_b > 59153.9 )
								if( senkou_span_a_displaced <= 59317.6 )
									ret := -0.037037
								if( senkou_span_a_displaced > 59317.6 )
									ret := 0.552723
				if( senkou_span_a > 59578.6 )
					if( basis_minus <= -145.709 )
						if( senkou_span_b_displaced <= 64282.9 )
							if( senkou_span_b_displaced <= 62144 )
								if( senkou_span_b_displaced <= 61645.6 )
									ret := 0.190017
								if( senkou_span_b_displaced > 61645.6 )
									ret := -0.290727
							if( senkou_span_b_displaced > 62144 )
								if( senkou_span_a <= 63754.3 )
									ret := 0.490862
								if( senkou_span_a > 63754.3 )
									ret := 0.035714
						if( senkou_span_b_displaced > 64282.9 )
							if( chinkou_span <= 63723.1 )
								if( chinkou_span <= 62983.4 )
									ret := -0.825688 // sell
								if( chinkou_span > 62983.4 )
									ret := -0.476744
							if( chinkou_span > 63723.1 )
								if( tenkan_sen <= 71019.7 )
									ret := 0.129570
								if( tenkan_sen > 71019.7 )
									ret := -0.435644
					if( basis_minus > -145.709 )
						if( senkou_span_a_displaced <= 60857.9 )
							if( chinkou_span <= 60518.2 )
								if( senkou_span_a_displaced <= 60533.2 )
									ret := 0.113975
								if( senkou_span_a_displaced > 60533.2 )
									ret := -0.250000
							if( chinkou_span > 60518.2 )
								if( senkou_span_b <= 60584.6 )
									ret := 0.661538
								if( senkou_span_b > 60584.6 )
									ret := 0.220703
						if( senkou_span_a_displaced > 60857.9 )
							if( chinkou_span <= 60392.6 )
								if( tenkan_sen <= 60822 )
									ret := -0.583893
								if( tenkan_sen > 60822 )
									ret := -0.906250 // sell
							if( chinkou_span > 60392.6 )
								if( chinkou_span <= 63245.5 )
									ret := -0.001962
								if( chinkou_span > 63245.5 )
									ret := 0.068551
	
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
float op_operation = decision_tree_0_BTCUSDT_1Min_afabab15(basis_max, tenkan_sen, senkou_span_b, senkou_span_b_displaced, kinjun_sen, senkou_span_a, chinkou_span, basis_minus, cross_dn_tenkan_kinjunInt, senkou_span_a_displaced, cross_up_tenkan_kinjunInt)

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


