//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: UPST_1Min_2CM0_822de70c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2CM0_822de70c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_822de70c(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow <= 419.093 )
		if( Raw_Money_Flow <= 52091.3 )
			if( MFI_Low <= 3.56172 )
				if( ad_mf <= -0.149655 )
					if( ad <= -1408.99 )
						if( Positive_Money_Flow_Sum <= 142795 )
							if( MFI_Low <= 0.245782 )
								if( MFI <= 10.8732 )
									ret := 0.300000
								if( MFI > 10.8732 )
									ret := -0.181818
							if( MFI_Low > 0.245782 )
								ret := -0.769231 // sell
						if( Positive_Money_Flow_Sum > 142795 )
							if( ad_mf <= -1566.92 )
								if( MFI_Low <= 0.34565 )
									ret := 0.062500
								if( MFI_Low > 0.34565 )
									ret := 0.083333
							if( ad_mf > -1566.92 )
								ret := 0.857143 // buy
					if( ad > -1408.99 )
						if( Negative_Money_Flow_Sum <= 298738 )
							if( Positive_Money_Flow_Sum <= 58754.3 )
								if( Money_Flow_Ratio <= 0.196855 )
									ret := 0.048780
								if( Money_Flow_Ratio > 0.196855 )
									ret := 0.641026
							if( Positive_Money_Flow_Sum > 58754.3 )
								ret := -0.315789
						if( Negative_Money_Flow_Sum > 298738 )
							if( mf <= 0.285916 )
								if( Typical_Price <= 22.5653 )
									ret := 0.062500
								if( Typical_Price > 22.5653 )
									ret := 0.685921
							if( mf > 0.285916 )
								if( MFI <= 11.1678 )
									ret := 0.081081
								if( MFI > 11.1678 )
									ret := 0.650000
				if( ad_mf > -0.149655 )
					if( ad_mf <= -0.115451 )
						if( Raw_Money_Flow <= 7779.95 )
							ret := -0.800000 // sell
						if( Raw_Money_Flow > 7779.95 )
							ret := -0.055556
					if( ad_mf > -0.115451 )
						if( Positive_Money_Flow <= 200.404 )
							if( Negative_Money_Flow <= 6101.35 )
								if( Raw_Money_Flow <= 6838.5 )
									ret := -0.032710
								if( Raw_Money_Flow > 6838.5 )
									ret := 0.300000
							if( Negative_Money_Flow > 6101.35 )
								if( Negative_Money_Flow_Sum <= 646163 )
									ret := 0.400911
								if( Negative_Money_Flow_Sum > 646163 )
									ret := 0.117347
						if( Positive_Money_Flow > 200.404 )
							ret := -0.692308
			if( MFI_Low > 3.56172 )
				if( ad <= 691.219 )
					if( ad_mf <= -0.870165 )
						if( Negative_Money_Flow_Sum <= 153777 )
							if( mf <= 0.085627 )
								if( Positive_Money_Flow_Sum <= 51428.5 )
									ret := -0.193548
								if( Positive_Money_Flow_Sum > 51428.5 )
									ret := 0.600950
							if( mf > 0.085627 )
								if( Money_Flow_Ratio <= 4.58949 )
									ret := 0.388393
								if( Money_Flow_Ratio > 4.58949 )
									ret := -0.170732
						if( Negative_Money_Flow_Sum > 153777 )
							if( ad <= -1869.4 )
								if( mf <= 0.042649 )
									ret := -0.213115
								if( mf > 0.042649 )
									ret := 0.069444
							if( ad > -1869.4 )
								if( mf <= -0.155224 )
									ret := 0.385768
								if( mf > -0.155224 )
									ret := 0.121727
					if( ad_mf > -0.870165 )
						if( Negative_Money_Flow <= 2314.57 )
							if( Positive_Money_Flow_Sum <= 120515 )
								if( MFI_Low <= 55.983 )
									ret := 0.034274
								if( MFI_Low > 55.983 )
									ret := 0.775000 // buy
							if( Positive_Money_Flow_Sum > 120515 )
								if( Positive_Money_Flow <= 23.2206 )
									ret := -0.108924
								if( Positive_Money_Flow > 23.2206 )
									ret := -0.777778 // sell
						if( Negative_Money_Flow > 2314.57 )
							if( Negative_Money_Flow <= 9939.96 )
								if( MFI_High <= -8.74376 )
									ret := 0.341827
								if( MFI_High > -8.74376 )
									ret := 0.079545
							if( Negative_Money_Flow > 9939.96 )
								if( MFI <= 23.9129 )
									ret := -0.483871
								if( MFI > 23.9129 )
									ret := 0.056201
				if( ad > 691.219 )
					if( Money_Flow_Ratio <= 2.19609 )
						if( Negative_Money_Flow_Sum <= 262759 )
							if( Negative_Money_Flow <= 25170.3 )
								if( Negative_Money_Flow_Sum <= 226287 )
									ret := 0.100000
								if( Negative_Money_Flow_Sum > 226287 )
									ret := -0.500000
							if( Negative_Money_Flow > 25170.3 )
								if( Positive_Money_Flow_Sum <= 194430 )
									ret := -0.352941
								if( Positive_Money_Flow_Sum > 194430 )
									ret := -0.855263 // sell
						if( Negative_Money_Flow_Sum > 262759 )
							if( mf <= -0.351264 )
								ret := 0.352941
							if( mf > -0.351264 )
								if( ad <= 1769.5 )
									ret := -0.117241
								if( ad > 1769.5 )
									ret := 0.166667
					if( Money_Flow_Ratio > 2.19609 )
						if( Positive_Money_Flow_Sum <= 426772 )
							if( Typical_Price <= 25.93 )
								ret := -0.181818
							if( Typical_Price > 25.93 )
								ret := -0.538462
						if( Positive_Money_Flow_Sum > 426772 )
							if( Negative_Money_Flow <= 34283.6 )
								if( ad_mf <= 1037.69 )
									ret := 0.000000
								if( ad_mf > 1037.69 )
									ret := -0.200000
							if( Negative_Money_Flow > 34283.6 )
								if( ad <= 1304.23 )
									ret := 0.526316
								if( ad > 1304.23 )
									ret := 0.027778
		if( Raw_Money_Flow > 52091.3 )
			if( ad_mf <= -16004.7 )
				if( ad_mf <= -50132.2 )
					if( Money_Flow_Ratio <= 0.152746 )
						if( Negative_Money_Flow <= 3.44226e+06 )
							if( MFI_Low <= -9.27269 )
								if( ad <= -79933.4 )
									ret := 0.750000 // buy
								if( ad > -79933.4 )
									ret := 0.181818
							if( MFI_Low > -9.27269 )
								ret := -0.875000 // sell
						if( Negative_Money_Flow > 3.44226e+06 )
							if( Typical_Price <= 35.0725 )
								if( mf <= -0.263592 )
									ret := 0.142857
								if( mf > -0.263592 )
									ret := -0.866667 // sell
							if( Typical_Price > 35.0725 )
								ret := -0.933333 // sell
					if( Money_Flow_Ratio > 0.152746 )
						if( Positive_Money_Flow_Sum <= 3.32076e+07 )
							if( Money_Flow_Ratio <= 0.504803 )
								if( Money_Flow_Ratio <= 0.198237 )
									ret := 0.282609
								if( Money_Flow_Ratio > 0.198237 )
									ret := 0.726115 // buy
							if( Money_Flow_Ratio > 0.504803 )
								if( Typical_Price <= 26.5608 )
									ret := 0.649123
								if( Typical_Price > 26.5608 )
									ret := -0.006873
						if( Positive_Money_Flow_Sum > 3.32076e+07 )
							if( MFI_Low <= 57.9982 )
								if( Negative_Money_Flow <= 6.98736e+06 )
									ret := 0.964912 // buy
								if( Negative_Money_Flow > 6.98736e+06 )
									ret := 0.615385
							if( MFI_Low > 57.9982 )
								ret := 0.466667
				if( ad_mf > -50132.2 )
					if( ad <= -49772.5 )
						ret := -0.928571 // sell
					if( ad > -49772.5 )
						if( Typical_Price <= 23.8375 )
							if( Raw_Money_Flow <= 738101 )
								if( Typical_Price <= 23.5589 )
									ret := 0.000000
								if( Typical_Price > 23.5589 )
									ret := 0.581395
							if( Raw_Money_Flow > 738101 )
								if( MFI_Low <= 12.7661 )
									ret := 0.111111
								if( MFI_Low > 12.7661 )
									ret := 0.756410 // buy
						if( Typical_Price > 23.8375 )
							if( ad <= -16102.1 )
								if( Negative_Money_Flow_Sum <= 2.62836e+07 )
									ret := 0.047768
								if( Negative_Money_Flow_Sum > 2.62836e+07 )
									ret := 0.670886
							if( ad > -16102.1 )
								if( ad_mf <= -16077.9 )
									ret := 0.916667 // buy
								if( ad_mf > -16077.9 )
									ret := 0.700000 // buy
			if( ad_mf > -16004.7 )
				if( Positive_Money_Flow_Sum <= 4.89307e+07 )
					if( Negative_Money_Flow <= 537908 )
						if( Negative_Money_Flow_Sum <= 6.84158e+06 )
							if( Positive_Money_Flow_Sum <= 8.13036e+06 )
								if( Money_Flow_Ratio <= 0.829293 )
									ret := 0.031876
								if( Money_Flow_Ratio > 0.829293 )
									ret := -0.041925
							if( Positive_Money_Flow_Sum > 8.13036e+06 )
								if( Negative_Money_Flow <= 344293 )
									ret := 0.450980
								if( Negative_Money_Flow > 344293 )
									ret := 0.117284
						if( Negative_Money_Flow_Sum > 6.84158e+06 )
							if( Raw_Money_Flow <= 321183 )
								if( MFI_Low <= 10.0362 )
									ret := 0.234694
								if( MFI_Low > 10.0362 )
									ret := 0.601307
							if( Raw_Money_Flow > 321183 )
								if( Negative_Money_Flow <= 325294 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow > 325294 )
									ret := 0.130217
					if( Negative_Money_Flow > 537908 )
						if( Negative_Money_Flow_Sum <= 994632 )
							if( Typical_Price <= 26.1358 )
								if( Negative_Money_Flow <= 711828 )
									ret := -0.600000
								if( Negative_Money_Flow > 711828 )
									ret := 0.714286 // buy
							if( Typical_Price > 26.1358 )
								if( Typical_Price <= 33.9057 )
									ret := 1.000000 // buy
								if( Typical_Price > 33.9057 )
									ret := 0.857143 // buy
						if( Negative_Money_Flow_Sum > 994632 )
							if( MFI <= 38.4097 )
								if( Negative_Money_Flow <= 4.60539e+06 )
									ret := -0.185243
								if( Negative_Money_Flow > 4.60539e+06 )
									ret := 0.605634
							if( MFI > 38.4097 )
								if( ad <= 51708.4 )
									ret := -0.015164
								if( ad > 51708.4 )
									ret := -0.477612
				if( Positive_Money_Flow_Sum > 4.89307e+07 )
					if( Negative_Money_Flow <= 4.05968e+06 )
						ret := 0.888889 // buy
					if( Negative_Money_Flow > 4.05968e+06 )
						ret := 1.000000 // buy
	if( Positive_Money_Flow > 419.093 )
		if( ad <= -137.153 )
			if( Positive_Money_Flow_Sum <= 343631 )
				if( mf <= -0.130815 )
					if( MFI_High <= -72.3236 )
						ret := -0.833333 // sell
					if( MFI_High > -72.3236 )
						if( Money_Flow_Ratio <= 1.41613 )
							if( Positive_Money_Flow <= 4565.05 )
								if( MFI_Low <= 17.7634 )
									ret := 0.294118
								if( MFI_Low > 17.7634 )
									ret := -0.882353 // sell
							if( Positive_Money_Flow > 4565.05 )
								if( Negative_Money_Flow <= 45.368 )
									ret := 0.301790
								if( Negative_Money_Flow > 45.368 )
									ret := 0.829787 // buy
						if( Money_Flow_Ratio > 1.41613 )
							if( MFI_High <= -1.42472 )
								if( Negative_Money_Flow_Sum <= 116524 )
									ret := 0.823529 // buy
								if( Negative_Money_Flow_Sum > 116524 )
									ret := 0.530612
							if( MFI_High > -1.42472 )
								if( MFI <= 79.5409 )
									ret := -0.454545
								if( MFI > 79.5409 )
									ret := 0.375000
				if( mf > -0.130815 )
					if( Typical_Price <= 21.8749 )
						if( Positive_Money_Flow <= 28391 )
							ret := -0.950000 // sell
						if( Positive_Money_Flow > 28391 )
							ret := -0.461538
					if( Typical_Price > 21.8749 )
						if( Positive_Money_Flow_Sum <= 246130 )
							if( MFI_High <= -3.36564 )
								if( MFI <= 70.7723 )
									ret := 0.073879
								if( MFI > 70.7723 )
									ret := 0.636364
							if( MFI_High > -3.36564 )
								if( ad <= -976.058 )
									ret := -0.076923
								if( ad > -976.058 )
									ret := -0.740741 // sell
						if( Positive_Money_Flow_Sum > 246130 )
							if( Negative_Money_Flow_Sum <= 208522 )
								if( mf <= 0.164735 )
									ret := 0.872340 // buy
								if( mf > 0.164735 )
									ret := -0.222222
							if( Negative_Money_Flow_Sum > 208522 )
								if( Typical_Price <= 31.6726 )
									ret := 0.200000
								if( Typical_Price > 31.6726 )
									ret := -0.714286 // sell
			if( Positive_Money_Flow_Sum > 343631 )
				if( MFI_Low <= 72.1733 )
					if( MFI_Low <= 68.5096 )
						if( Typical_Price <= 54.6553 )
							if( Negative_Money_Flow <= 85.1506 )
								if( Positive_Money_Flow_Sum <= 682354 )
									ret := -0.104854
								if( Positive_Money_Flow_Sum > 682354 )
									ret := 0.038243
							if( Negative_Money_Flow > 85.1506 )
								if( Negative_Money_Flow <= 51152.7 )
									ret := 0.358178
								if( Negative_Money_Flow > 51152.7 )
									ret := -0.019380
						if( Typical_Price > 54.6553 )
							ret := -0.888889 // sell
					if( MFI_Low > 68.5096 )
						if( MFI_High <= 9.95568 )
							if( MFI_High <= 9.02497 )
								if( MFI <= 88.75 )
									ret := -0.588235
								if( MFI > 88.75 )
									ret := -0.266667
							if( MFI_High > 9.02497 )
								if( Raw_Money_Flow <= 895386 )
									ret := -0.552632
								if( Raw_Money_Flow > 895386 )
									ret := -0.909091 // sell
						if( MFI_High > 9.95568 )
							if( ad_mf <= -7220.25 )
								if( Typical_Price <= 31.5193 )
									ret := -0.285714
								if( Typical_Price > 31.5193 )
									ret := 0.368421
							if( ad_mf > -7220.25 )
								if( ad <= -3539.62 )
									ret := -0.818182 // sell
								if( ad > -3539.62 )
									ret := -0.022727
				if( MFI_Low > 72.1733 )
					if( Raw_Money_Flow <= 285002 )
						if( MFI_High <= 15.9775 )
							if( Negative_Money_Flow_Sum <= 108003 )
								ret := -0.083333
							if( Negative_Money_Flow_Sum > 108003 )
								if( ad <= -3259.13 )
									ret := -0.444444
								if( ad > -3259.13 )
									ret := -0.909091 // sell
						if( MFI_High > 15.9775 )
							ret := 0.785714 // buy
					if( Raw_Money_Flow > 285002 )
						if( Positive_Money_Flow_Sum <= 7.3368e+06 )
							if( Raw_Money_Flow <= 1.52676e+06 )
								if( Negative_Money_Flow_Sum <= 122205 )
									ret := -0.111111
								if( Negative_Money_Flow_Sum > 122205 )
									ret := 0.642857
							if( Raw_Money_Flow > 1.52676e+06 )
								ret := -0.615385
						if( Positive_Money_Flow_Sum > 7.3368e+06 )
							if( mf <= 0.014643 )
								ret := 1.000000 // buy
							if( mf > 0.014643 )
								if( Positive_Money_Flow_Sum <= 1.25423e+07 )
									ret := 0.783784 // buy
								if( Positive_Money_Flow_Sum > 1.25423e+07 )
									ret := 0.250000
		if( ad > -137.153 )
			if( ad <= 1278.36 )
				if( Positive_Money_Flow_Sum <= 438322 )
					if( mf <= -0.000907 )
						if( Typical_Price <= 27.9857 )
							if( MFI <= 76.7497 )
								if( Positive_Money_Flow <= 55010.6 )
									ret := -0.234848
								if( Positive_Money_Flow > 55010.6 )
									ret := 0.173469
							if( MFI > 76.7497 )
								if( ad_mf <= 0.13783 )
									ret := 0.790698 // buy
								if( ad_mf > 0.13783 )
									ret := 0.120482
						if( Typical_Price > 27.9857 )
							if( MFI <= 7.66018 )
								if( Positive_Money_Flow_Sum <= 110932 )
									ret := -0.822222 // sell
								if( Positive_Money_Flow_Sum > 110932 )
									ret := 0.142857
							if( MFI > 7.66018 )
								if( Typical_Price <= 28.0872 )
									ret := 0.640000
								if( Typical_Price > 28.0872 )
									ret := 0.025180
					if( mf > -0.000907 )
						if( Positive_Money_Flow_Sum <= 258114 )
							if( mf <= 0.17927 )
								if( MFI_High <= -31.7792 )
									ret := -0.163695
								if( MFI_High > -31.7792 )
									ret := -0.353900
							if( mf > 0.17927 )
								if( MFI <= 83.6245 )
									ret := -0.079927
								if( MFI > 83.6245 )
									ret := -0.848485 // sell
						if( Positive_Money_Flow_Sum > 258114 )
							if( MFI <= 44.6403 )
								if( MFI_High <= -37.2634 )
									ret := -0.201835
								if( MFI_High > -37.2634 )
									ret := 0.823529 // buy
							if( MFI > 44.6403 )
								if( Positive_Money_Flow_Sum <= 398135 )
									ret := -0.504274
								if( Positive_Money_Flow_Sum > 398135 )
									ret := -0.791667 // sell
				if( Positive_Money_Flow_Sum > 438322 )
					if( MFI <= 81.906 )
						if( Negative_Money_Flow_Sum <= 189661 )
							if( Typical_Price <= 26.1606 )
								ret := -0.153846
							if( Typical_Price > 26.1606 )
								if( ad_mf <= 157.734 )
									ret := 0.160000
								if( ad_mf > 157.734 )
									ret := 0.744681 // buy
						if( Negative_Money_Flow_Sum > 189661 )
							if( MFI_High <= -0.849267 )
								if( Raw_Money_Flow <= 794927 )
									ret := -0.048391
								if( Raw_Money_Flow > 794927 )
									ret := 0.345455
							if( MFI_High > -0.849267 )
								if( ad_mf <= 0.025729 )
									ret := 0.000000
								if( ad_mf > 0.025729 )
									ret := 0.369863
					if( MFI > 81.906 )
						if( Positive_Money_Flow <= 5774.64 )
							if( ad_mf <= 0.157183 )
								if( Negative_Money_Flow <= 0.819564 )
									ret := -0.012658
								if( Negative_Money_Flow > 0.819564 )
									ret := 0.851852 // buy
							if( ad_mf > 0.157183 )
								if( Positive_Money_Flow <= 3086.1 )
									ret := -0.800000 // sell
								if( Positive_Money_Flow > 3086.1 )
									ret := 0.200000
						if( Positive_Money_Flow > 5774.64 )
							if( Typical_Price <= 22.4969 )
								if( Positive_Money_Flow_Sum <= 605964 )
									ret := 0.866667 // buy
								if( Positive_Money_Flow_Sum > 605964 )
									ret := 0.040000
							if( Typical_Price > 22.4969 )
								if( Negative_Money_Flow_Sum <= 58298.6 )
									ret := -0.723404 // sell
								if( Negative_Money_Flow_Sum > 58298.6 )
									ret := -0.245652
			if( ad > 1278.36 )
				if( Positive_Money_Flow_Sum <= 770826 )
					if( Negative_Money_Flow_Sum <= 123683 )
						if( MFI_Low <= 69.2509 )
							if( MFI_High <= 7.21961 )
								if( MFI_High <= 6.26347 )
									ret := -0.621951
								if( MFI_High > 6.26347 )
									ret := -0.125000
							if( MFI_High > 7.21961 )
								if( Positive_Money_Flow_Sum <= 638517 )
									ret := -0.818182 // sell
								if( Positive_Money_Flow_Sum > 638517 )
									ret := -1.000000 // sell
						if( MFI_Low > 69.2509 )
							if( Raw_Money_Flow <= 106007 )
								ret := 0.235294
							if( Raw_Money_Flow > 106007 )
								if( Negative_Money_Flow_Sum <= 57179.4 )
									ret := -0.916667 // sell
								if( Negative_Money_Flow_Sum > 57179.4 )
									ret := -0.300000
					if( Negative_Money_Flow_Sum > 123683 )
						if( Positive_Money_Flow <= 112111 )
							if( Positive_Money_Flow_Sum <= 548918 )
								if( MFI <= 28.1374 )
									ret := 0.127219
								if( MFI > 28.1374 )
									ret := -0.036364
							if( Positive_Money_Flow_Sum > 548918 )
								if( ad_mf <= 3705.35 )
									ret := -0.197154
								if( ad_mf > 3705.35 )
									ret := 0.206522
						if( Positive_Money_Flow > 112111 )
							if( mf <= 0.021719 )
								if( MFI_Low <= 34.1064 )
									ret := -0.141762
								if( MFI_Low > 34.1064 )
									ret := 0.305085
							if( mf > 0.021719 )
								if( Positive_Money_Flow_Sum <= 595578 )
									ret := -0.384906
								if( Positive_Money_Flow_Sum > 595578 )
									ret := -0.159664
				if( Positive_Money_Flow_Sum > 770826 )
					if( Positive_Money_Flow_Sum <= 2.37987e+07 )
						if( Raw_Money_Flow <= 3.3123e+06 )
							if( Money_Flow_Ratio <= 1.43474 )
								if( MFI <= 51.4171 )
									ret := -0.025231
								if( MFI > 51.4171 )
									ret := -0.140153
							if( Money_Flow_Ratio > 1.43474 )
								if( Money_Flow_Ratio <= 4.42018 )
									ret := 0.053147
								if( Money_Flow_Ratio > 4.42018 )
									ret := -0.111658
						if( Raw_Money_Flow > 3.3123e+06 )
							if( ad_mf <= 100242 )
								if( MFI_High <= 14.1953 )
									ret := -0.400000
								if( MFI_High > 14.1953 )
									ret := 0.583333
							if( ad_mf > 100242 )
								if( MFI_High <= -22.6236 )
									ret := -0.930233 // sell
								if( MFI_High > -22.6236 )
									ret := -0.561644
					if( Positive_Money_Flow_Sum > 2.37987e+07 )
						if( Typical_Price <= 35.0359 )
							if( mf <= 0.36829 )
								if( ad <= 123118 )
									ret := 0.666667
								if( ad > 123118 )
									ret := -0.100000
							if( mf > 0.36829 )
								ret := -0.750000 // sell
						if( Typical_Price > 35.0359 )
							if( Positive_Money_Flow_Sum <= 7.80555e+07 )
								if( mf <= 0.253252 )
									ret := -0.201117
								if( mf > 0.253252 )
									ret := 0.350000
							if( Positive_Money_Flow_Sum > 7.80555e+07 )
								ret := -0.882353 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_UPST_1Min_822de70c(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


